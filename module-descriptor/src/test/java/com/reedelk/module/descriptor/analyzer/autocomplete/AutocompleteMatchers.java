package com.reedelk.module.descriptor.analyzer.autocomplete;

import com.reedelk.module.descriptor.analyzer.Matcher;
import com.reedelk.module.descriptor.model.AutocompleteItemDescriptor;
import com.reedelk.runtime.api.autocomplete.AutocompleteItemType;

import java.util.Objects;

public class AutocompleteMatchers {

    public static Matcher<AutocompleteItemDescriptor> ofAutocompleteItemDescriptor(AutocompleteItemDescriptor expected) {
        return actual -> {
            String expectedType = expected.getType();
            String actualType = actual.getType();
            String expectedToken = expected.getToken();
            String actualToken = actual.getToken();
            String expectedReturnType = expected.getReturnType();
            String actualReturnType = actual.getReturnType();
            String expectedDescription = expected.getDescription();
            String actualDescription = actual.getDescription();
            String expectedReplaceValue = expected.getReplaceValue();
            String actualReplaceValue = actual.getReplaceValue();
            int expectedCursorOffset = expected.getCursorOffset();
            int actualCursorOffset = actual.getCursorOffset();
            AutocompleteItemType expectedAutocompleteItemType = expected.getItemType();
            AutocompleteItemType actualAutocompleteItemType = actual.getItemType();
            return Objects.equals(expectedType, actualType) &&
                    Objects.equals(expectedToken, actualToken) &&
                    Objects.equals(expectedReturnType, actualReturnType) &&
                    Objects.equals(expectedDescription, actualDescription) &&
                    Objects.equals(expectedReplaceValue, actualReplaceValue) &&
                    Objects.equals(expectedCursorOffset, actualCursorOffset) &&
                    Objects.equals(expectedAutocompleteItemType, actualAutocompleteItemType);
        };
    }
}
