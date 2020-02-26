package com.reedelk.runtime.api.annotation;

import com.reedelk.runtime.api.autocomplete.AutocompleteItemType;

import java.lang.annotation.*;

@Repeatable(AutocompleteItems.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
public @interface AutocompleteItem {

    String USE_DEFAULT_TOKEN = "###USE_DEFAULT_TOKEN###";

    String token() default USE_DEFAULT_TOKEN;

    String USE_DEFAULT_RETURN_TYPE = "###USE_DEFAULT_RETURN_TYPE###";

    String returnType() default USE_DEFAULT_RETURN_TYPE;

    String description() default "";

    String replaceValue();

    int cursorOffset() default 0;

    /*
     * An autocomplete item could be a function or a variable.
     */
    AutocompleteItemType itemType() default AutocompleteItemType.FUNCTION;

}
