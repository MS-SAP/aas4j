/*
 * Copyright (c) 2021 Fraunhofer-Gesellschaft zur Foerderung der angewandten Forschung e. V.
 * Copyright (c) 2023 SAP SE
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

package org.eclipse.digitaltwin.aas4j.v3.model.impl;

import org.eclipse.digitaltwin.aas4j.v3.model.*;
import org.eclipse.digitaltwin.aas4j.v3.model.annotations.IRI;
import org.eclipse.digitaltwin.aas4j.v3.model.builder.OperationBuilder;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


/**
 * Default implementation of package org.eclipse.digitaltwin.aas4j.v3.model.Operation
 * 
 * An operation is a submodel element with input and output variables.
 */

@IRI("aas:Operation")
public class DefaultOperation implements Operation {

    @IRI("https://admin-shell.io/aas/3/0/HasDataSpecification/embeddedDataSpecifications")
    protected List<EmbeddedDataSpecification> embeddedDataSpecifications = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/HasExtensions/extensions")
    protected List<Extension> extensions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/semanticId")
    protected Reference semanticId;

    @IRI("https://admin-shell.io/aas/3/0/HasSemantics/supplementalSemanticIds")
    protected List<Reference> supplementalSemanticIds = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Operation/inoutputVariables")
    protected List<OperationVariable> inoutputVariables = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Operation/inputVariables")
    protected List<OperationVariable> inputVariables = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Operation/outputVariables")
    protected List<OperationVariable> outputVariables = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Qualifiable/qualifiers")
    protected List<Qualifier> qualifiers = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Referable/category")
    protected String category;

    @IRI("https://admin-shell.io/aas/3/0/Referable/description")
    protected List<LangStringTextType> descriptions = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Referable/displayName")
    protected List<LangStringNameType> displayNames = new ArrayList<>();

    @IRI("https://admin-shell.io/aas/3/0/Referable/idShort")
    protected String idShort;

    public DefaultOperation() {}

    @Override
    public int hashCode() {
        return Objects.hash(this.inputVariables,
            this.outputVariables,
            this.inoutputVariables,
            this.embeddedDataSpecifications,
            this.semanticId,
            this.supplementalSemanticIds,
            this.qualifiers,
            this.category,
            this.idShort,
            this.displayNames,
            this.descriptions,
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
            DefaultOperation other = (DefaultOperation) obj;
            return Objects.equals(this.inputVariables, other.inputVariables) &&
                Objects.equals(this.outputVariables, other.outputVariables) &&
                Objects.equals(this.inoutputVariables, other.inoutputVariables) &&
                Objects.equals(this.embeddedDataSpecifications, other.embeddedDataSpecifications) &&
                Objects.equals(this.semanticId, other.semanticId) &&
                Objects.equals(this.supplementalSemanticIds, other.supplementalSemanticIds) &&
                Objects.equals(this.qualifiers, other.qualifiers) &&
                Objects.equals(this.category, other.category) &&
                Objects.equals(this.idShort, other.idShort) &&
                Objects.equals(this.displayNames, other.displayNames) &&
                Objects.equals(this.descriptions, other.descriptions) &&
                Objects.equals(this.extensions, other.extensions);
        }
    }

    @Override
    public List<OperationVariable> getInputVariables() {
        return inputVariables;
    }

    @Override
    public void setInputVariables(List<OperationVariable> inputVariables) {
        this.inputVariables = inputVariables;
    }

    @Override
    public List<OperationVariable> getOutputVariables() {
        return outputVariables;
    }

    @Override
    public void setOutputVariables(List<OperationVariable> outputVariables) {
        this.outputVariables = outputVariables;
    }

    @Override
    public List<OperationVariable> getInoutputVariables() {
        return inoutputVariables;
    }

    @Override
    public void setInoutputVariables(List<OperationVariable> inoutputVariables) {
        this.inoutputVariables = inoutputVariables;
    }

    @Override
    public List<EmbeddedDataSpecification> getEmbeddedDataSpecifications() {
        return embeddedDataSpecifications;
    }

    @Override
    public void setEmbeddedDataSpecifications(List<EmbeddedDataSpecification> embeddedDataSpecifications) {
        this.embeddedDataSpecifications = embeddedDataSpecifications;
    }

    @Override
    public Reference getSemanticId() {
        return semanticId;
    }

    @Override
    public void setSemanticId(Reference semanticId) {
        this.semanticId = semanticId;
    }

    @Override
    public List<Reference> getSupplementalSemanticIds() {
        return supplementalSemanticIds;
    }

    @Override
    public void setSupplementalSemanticIds(List<Reference> supplementalSemanticIds) {
        this.supplementalSemanticIds = supplementalSemanticIds;
    }

    @Override
    public List<Qualifier> getQualifiers() {
        return qualifiers;
    }

    @Override
    public void setQualifiers(List<Qualifier> qualifiers) {
        this.qualifiers = qualifiers;
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
    public List<LangStringNameType> getDisplayNames() {
        return displayNames;
    }

    @Override
    public void setDisplayNames(List<LangStringNameType> displayNames) {
        this.displayNames = displayNames;
    }

    @Override
    public List<LangStringTextType> getDescriptions() {
        return descriptions;
    }

    @Override
    public void setDescriptions(List<LangStringTextType> descriptions) {
        this.descriptions = descriptions;
    }

    @Override
    public List<Extension> getExtensions() {
        return extensions;
    }

    @Override
    public void setExtensions(List<Extension> extensions) {
        this.extensions = extensions;
    }

    public String toString() {
        return String.format(
            "DefaultOperation (" + "inputVariables=%s,"
                + "outputVariables=%s,"
                + "inoutputVariables=%s,"
                + ")",
            this.inputVariables, this.outputVariables, this.inoutputVariables);
    }

    /**
     * This builder class can be used to construct a DefaultOperation bean.
     */
    public static class Builder extends OperationBuilder<DefaultOperation, Builder> {

        @Override
        protected Builder getSelf() {
            return this;
        }

        @Override
        protected DefaultOperation newBuildingInstance() {
            return new DefaultOperation();
        }
    }
}
