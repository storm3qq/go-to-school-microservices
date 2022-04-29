package com.uet.gts.core.common.util.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.Set;

public class GreaterThan0Validator implements ConstraintValidator<GreaterThan0, Set<Integer>> {
    @Override
    public boolean isValid(Set<Integer> values, ConstraintValidatorContext constraintValidatorContext) {
        return values.stream().allMatch(v -> v > 0);
    }
}
