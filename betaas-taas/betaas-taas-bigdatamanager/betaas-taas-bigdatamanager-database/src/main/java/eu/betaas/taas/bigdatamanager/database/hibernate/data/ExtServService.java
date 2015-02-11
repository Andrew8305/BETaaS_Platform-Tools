/*
 Copyright 2014-2015 Hewlett-Packard Development Company, L.P.

 Licensed under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License.
 You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

 Unless required by applicable law or agreed to in writing, software
 distributed under the License is distributed on an "AS IS" BASIS,
 WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 See the License for the specific language governing permissions and
 limitations under the License.
 */
package eu.betaas.taas.bigdatamanager.database.hibernate.data;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.EmbeddedId;
import java.io.Serializable;

@Entity
@Table(name="T_EXT_SERV_SERVICE")
public class ExtServService implements Serializable {

	@EmbeddedId
	private ExtServServicePK id;
	
	private String name;
	
	private int status;
	
	private byte[] semantic_specs ;
	
	private byte[] credentials ;
	
	private byte[] qos_specs;

	public ExtServServicePK getId() {
		return id;
	}

	public void setId(ExtServServicePK id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}
	
	public void setStatus(int status) {
		this.status = status;
	}
	
	public int getStatus() {
		return status;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getSemantic_specs() {
		return semantic_specs;
	}

	public void setSemantic_specs(byte[] semantic_specs) {
		this.semantic_specs = semantic_specs;
	}

	public byte[] getCredentials() {
		return credentials;
	}

	public void setCredentials(byte[] credentials) {
		this.credentials = credentials;
	}

	public byte[] getQos_specs() {
		return qos_specs;
	}

	public void setQos_specs(byte[] qos_specs) {
		this.qos_specs = qos_specs;
	}




}
