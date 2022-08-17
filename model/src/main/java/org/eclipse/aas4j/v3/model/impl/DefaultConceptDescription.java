/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

package org.eclipse.aas4j.v3.model.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


import org.eclipse.aas4j.v3.model.*;
import org.eclipse.aas4j.v3.model.annotations.IRI;


import org.eclipse.aas4j.v3.model.builder.ConceptDescriptionBuilder;

/**
 * Default implementation of package org.eclipse.aas4j.v3.rc02.model.ConceptDescription
 * 
 * The semantics of a property or other elements that may have a semantic description is defined by
 * a concept description.
 */

@IRI("aas:ConceptDescription")
public class DefaultConceptDescription implements ConceptDescription {

    @IRI("https://admin-shell.io/aas/3/0/RC02/ConceptDescription/isCaseOf")
    protected List<Reference> isCaseOf = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/dataSpecifications")
    protected List<Reference> dataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasExtensions/extensions")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/RC02/Identifiable/administration")
    protected AdministrativeInformation administration;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Identifiable/id")
    protected String id;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/checksum")
    protected String checksum;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/descriptions")
    protected List<LangString> descriptions;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/displayNames")
    protected List<LangString> displayNames;

    @IRI("https://admin-shell.io/aas/3/0/RC02/Referable/idShort")
    protected String idShort;

    @IRI("https://admin-shell.io/aas/3/0/RC02/HasDataSpecification/embeddedDataSpecifications")
    protected List<DataSpecification> embeddedDataSpecifications = new ArrayList<>();

    public DefaultConceptDescription() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.isCaseOf,
            this.dataSpecifications,
            this.administration,
            this.id,
            this.category,
            this.idShort,
            this.displayNames,
            this.descriptions,
            this.checksum,
            this.extensions);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            DefaultConceptDescription other = (DefaultConceptDescription) obj;
            return Objects.equals(this.isCaseOf, other.isCaseOf) &&
                Objects.equals(this.dataSpecifications, other.dataSpecifications) &&
                Objects.equals(this.administration, other.administration) &&
                Objects.equals(this.id, other.id) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.checksum, other.checksum) &&
                Objects.equals(this.extensions, other.extensions);
        }
    }

    @Override
    public List<Reference> getIsCaseOf() {
        return isCaseOf;
    }

    @Override
    public void setIsCaseOf(List<Reference> isCaseOf) {
        this.isCaseOf = isCaseOf;
    }

    @Override
    public List<Reference> getDataSpecifications() {
        return dataSpecifications;
    }

    @Override
    public void setDataSpecifications(List<Reference> dataSpecifications) {
        this.dataSpecifications = dataSpecifications;
    }

    @Override
    public AdministrativeInformation getAdministration() {
        return administration;
    }

    @Override
    public void setAdministration(AdministrativeInformation administration) {
        this.administration = administration;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getCategory() {
        return category;
    }

    @Override
    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getIdShort() {
        return idShort;
    }

    @Override
    public void setIdShort(String idShort) {
        this.idShort = idShort;
    }

    @Override
    public List<LangString> getDisplayNames() {
        return displayNames;
    }

    @Override
    public void setDisplayNames(List<LangString> displayNames) {
        this.displayNames = displayNames;
    }

    @Override
    public List<LangString> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<LangString> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public String getChecksum() {
        return checksum;
    }

    @Override
    public void setChecksum(String checksum) {
        this.checksum = checksum;
    }

    @Override
    public List<Extension> getExtensions() {
        return extensions;
    }

    @Override
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    @Override
    public List<DataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    public void setEmbeddedDataSpecifications(List<DataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }

    /**
     * This builder class can be used to construct a DefaultConceptDescription bean.
     */
    public static class Builder extends ConceptDescriptionBuilder<DefaultConceptDescription, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultConceptDescription newBuildingInstance() {
            return new DefaultConceptDescription();
        }
    }
}