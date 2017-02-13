package com.hextremelabs.samples.rest.apidoc;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author oladeji
 */
@XmlRootElement
public class Stuff {

  private Long id;
  private String name;

  @XmlElement(name = "id")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  @XmlElement(name = "name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Stuff{" + "id=" + id + ", name=" + name + '}';
  }
}
