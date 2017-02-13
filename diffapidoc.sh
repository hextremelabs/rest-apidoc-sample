#!/bin/sh

curl http://app.yourcompany.com/rest-resources.txt > server-rest-api-doc.new
curl http://app.yourcompany.com/rest-resources.version > rest-resources.version

oldserial=`cat rest-resources.version`
echo "OLD SERIAL = $oldserial"

serial=$(echo 1 $oldserial | awk '{print $1 + $2}')

echo "DIFF FILENAME = rest-resources.diff.$serial"

diff server-rest-api-doc.old server-rest-api-doc.new > rest-resources.diff.$serial
difference=`cat rest-resources.diff.$serial`
if [ "$difference" == "" ]; then
    rm -f rest-resources*
    echo "=========NO DIFFERENCE: EXITING..."
    exit 0
fi
