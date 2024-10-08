package io.github.erp.domain.criteria;

import java.io.Serializable;
import java.util.Objects;
import java.util.Optional;
import org.springdoc.core.annotations.ParameterObject;
import tech.jhipster.service.Criteria;
import tech.jhipster.service.filter.*;

/**
 * Criteria class for the {@link io.github.erp.domain.Institution} entity. This class is used
 * in {@link io.github.erp.web.rest.InstitutionResource} to receive all the possible filtering options from
 * the Http GET request parameters.
 * For example the following could be a valid request:
 * {@code /institutions?id.greaterThan=5&attr1.contains=something&attr2.specified=false}
 * As Spring is unable to properly convert the types, unless specific {@link Filter} class are used, we need to use
 * fix type specific filters.
 */
@ParameterObject
@SuppressWarnings("common-java:DuplicatedBlocks")
public class InstitutionCriteria implements Serializable, Criteria {

    private static final long serialVersionUID = 1L;

    private LongFilter id;

    private StringFilter institutionName;

    private LongFilter parentInstitutionId;

    private Boolean distinct;

    public InstitutionCriteria() {}

    public InstitutionCriteria(InstitutionCriteria other) {
        this.id = other.optionalId().map(LongFilter::copy).orElse(null);
        this.institutionName = other.optionalInstitutionName().map(StringFilter::copy).orElse(null);
        this.parentInstitutionId = other.optionalParentInstitutionId().map(LongFilter::copy).orElse(null);
        this.distinct = other.distinct;
    }

    @Override
    public InstitutionCriteria copy() {
        return new InstitutionCriteria(this);
    }

    public LongFilter getId() {
        return id;
    }

    public Optional<LongFilter> optionalId() {
        return Optional.ofNullable(id);
    }

    public LongFilter id() {
        if (id == null) {
            setId(new LongFilter());
        }
        return id;
    }

    public void setId(LongFilter id) {
        this.id = id;
    }

    public StringFilter getInstitutionName() {
        return institutionName;
    }

    public Optional<StringFilter> optionalInstitutionName() {
        return Optional.ofNullable(institutionName);
    }

    public StringFilter institutionName() {
        if (institutionName == null) {
            setInstitutionName(new StringFilter());
        }
        return institutionName;
    }

    public void setInstitutionName(StringFilter institutionName) {
        this.institutionName = institutionName;
    }

    public LongFilter getParentInstitutionId() {
        return parentInstitutionId;
    }

    public Optional<LongFilter> optionalParentInstitutionId() {
        return Optional.ofNullable(parentInstitutionId);
    }

    public LongFilter parentInstitutionId() {
        if (parentInstitutionId == null) {
            setParentInstitutionId(new LongFilter());
        }
        return parentInstitutionId;
    }

    public void setParentInstitutionId(LongFilter parentInstitutionId) {
        this.parentInstitutionId = parentInstitutionId;
    }

    public Boolean getDistinct() {
        return distinct;
    }

    public Optional<Boolean> optionalDistinct() {
        return Optional.ofNullable(distinct);
    }

    public Boolean distinct() {
        if (distinct == null) {
            setDistinct(true);
        }
        return distinct;
    }

    public void setDistinct(Boolean distinct) {
        this.distinct = distinct;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        final InstitutionCriteria that = (InstitutionCriteria) o;
        return (
            Objects.equals(id, that.id) &&
            Objects.equals(institutionName, that.institutionName) &&
            Objects.equals(parentInstitutionId, that.parentInstitutionId) &&
            Objects.equals(distinct, that.distinct)
        );
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, institutionName, parentInstitutionId, distinct);
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "InstitutionCriteria{" +
            optionalId().map(f -> "id=" + f + ", ").orElse("") +
            optionalInstitutionName().map(f -> "institutionName=" + f + ", ").orElse("") +
            optionalParentInstitutionId().map(f -> "parentInstitutionId=" + f + ", ").orElse("") +
            optionalDistinct().map(f -> "distinct=" + f + ", ").orElse("") +
        "}";
    }
}
