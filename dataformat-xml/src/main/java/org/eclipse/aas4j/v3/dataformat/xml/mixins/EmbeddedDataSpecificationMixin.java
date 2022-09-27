/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.eclipse.aas4j.v3.dataformat.xml.mixins;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import org.eclipse.aas4j.v3.dataformat.xml.AasXmlNamespaceContext;
import org.eclipse.aas4j.v3.dataformat.xml.serialization.EmbeddedDataSpecificationSerializer;
import org.eclipse.aas4j.v3.dataformat.xml.serialization.SubmodelElementsSerializer;
import org.eclipse.aas4j.v3.model.*;

import java.util.List;

@JsonPropertyOrder({"dataSpecification", "dataSpecificationContent"})
public interface EmbeddedDataSpecificationMixin {

    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "dataSpecification")
    public Reference getDataSpecification();

    @JacksonXmlElementWrapper(namespace = AasXmlNamespaceContext.AAS_URI, localName = "dataSpecificationContent")
    @JsonSerialize(using = EmbeddedDataSpecificationSerializer.class)
    public DataSpecificationIEC61360 getDataSpecificationContent();

}