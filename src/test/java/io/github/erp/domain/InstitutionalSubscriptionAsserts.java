package io.github.erp.domain;

import static org.assertj.core.api.Assertions.assertThat;

public class InstitutionalSubscriptionAsserts {

    /**
     * Asserts that the entity has all properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInstitutionalSubscriptionAllPropertiesEquals(
        InstitutionalSubscription expected,
        InstitutionalSubscription actual
    ) {
        assertInstitutionalSubscriptionAutoGeneratedPropertiesEquals(expected, actual);
        assertInstitutionalSubscriptionAllUpdatablePropertiesEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all updatable properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInstitutionalSubscriptionAllUpdatablePropertiesEquals(
        InstitutionalSubscription expected,
        InstitutionalSubscription actual
    ) {
        assertInstitutionalSubscriptionUpdatableFieldsEquals(expected, actual);
        assertInstitutionalSubscriptionUpdatableRelationshipsEquals(expected, actual);
    }

    /**
     * Asserts that the entity has all the auto generated properties (fields/relationships) set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInstitutionalSubscriptionAutoGeneratedPropertiesEquals(
        InstitutionalSubscription expected,
        InstitutionalSubscription actual
    ) {
        assertThat(expected)
            .as("Verify InstitutionalSubscription auto generated properties")
            .satisfies(e -> assertThat(e.getId()).as("check id").isEqualTo(actual.getId()));
    }

    /**
     * Asserts that the entity has all the updatable fields set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInstitutionalSubscriptionUpdatableFieldsEquals(
        InstitutionalSubscription expected,
        InstitutionalSubscription actual
    ) {
        assertThat(expected)
            .as("Verify InstitutionalSubscription relevant properties")
            .satisfies(e -> assertThat(e.getStartDate()).as("check startDate").isEqualTo(actual.getStartDate()))
            .satisfies(e -> assertThat(e.getExpiryDate()).as("check expiryDate").isEqualTo(actual.getExpiryDate()))
            .satisfies(e -> assertThat(e.getMemberLimit()).as("check memberLimit").isEqualTo(actual.getMemberLimit()));
    }

    /**
     * Asserts that the entity has all the updatable relationships set.
     *
     * @param expected the expected entity
     * @param actual the actual entity
     */
    public static void assertInstitutionalSubscriptionUpdatableRelationshipsEquals(
        InstitutionalSubscription expected,
        InstitutionalSubscription actual
    ) {
        assertThat(expected)
            .as("Verify InstitutionalSubscription relationships")
            .satisfies(e -> assertThat(e.getInstitution()).as("check institution").isEqualTo(actual.getInstitution()));
    }
}
