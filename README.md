JAX-RS API Doc Generation Sample
===

How to run
---
`mvn clean package`

Where are the docs?
---
Your doc should be in `target/jaxrs-analyzer` and `target/generated-docs`

---
1. Your CI pipeline should first download the current API doc from your server (probably using `CURL`)

2. Then run and deploy your build (probably using your server management plugin) and API doc (probably using `antrun plugin` to run an `SCP Ant task`)

3. Then run the `diffapidoc.sh`

4. Finally upload the diff and version files (probably using `SCP`)
