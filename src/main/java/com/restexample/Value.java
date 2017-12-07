package com.restexample;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown= true)
public class Value {
 private Long id;
 private String quote;
 public Value() {
 }
public Long getId() {
	return this.id;
}
public void setId(Long id) {
	this.id = id;
}
public String getQuota() {
	return this.quote;
}
public void setQuota(String quote) {
	this.quote = quote;
}
@Override
public String toString() {
	System.out.println(getQuota());
    return "Value{" +
            "id=" + id +
            ", quote='" + quote + '\'' +
            '}';
}
 

}
