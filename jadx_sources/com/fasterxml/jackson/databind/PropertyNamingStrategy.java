package com.fasterxml.jackson.databind;

import com.fasterxml.jackson.databind.cfg.MapperConfig;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.fasterxml.jackson.databind.introspect.AnnotatedMethod;
import com.fasterxml.jackson.databind.introspect.AnnotatedParameter;
import java.io.Serializable;

/* JADX INFO: loaded from: classes45.dex */
public class PropertyNamingStrategy implements Serializable {

    @Deprecated
    public static final PropertyNamingStrategy CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES;

    @Deprecated
    public static final PropertyNamingStrategy KEBAB_CASE;

    @Deprecated
    public static final PropertyNamingStrategy LOWER_CAMEL_CASE = new PropertyNamingStrategy();

    @Deprecated
    public static final PropertyNamingStrategy LOWER_CASE;

    @Deprecated
    public static final PropertyNamingStrategy LOWER_DOT_CASE;

    @Deprecated
    public static final PropertyNamingStrategy PASCAL_CASE_TO_CAMEL_CASE;

    @Deprecated
    public static final PropertyNamingStrategy SNAKE_CASE;

    @Deprecated
    public static final PropertyNamingStrategy UPPER_CAMEL_CASE;
    private static final long serialVersionUID = 2;

    @Deprecated
    public static class KebabCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String translate(String str) {
            return PropertyNamingStrategyBase.translateLowerCaseWithSeparator(str, '-');
        }
    }

    @Deprecated
    public static class LowerDotCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String translate(String str) {
            return PropertyNamingStrategyBase.translateLowerCaseWithSeparator(str, '.');
        }
    }

    @Deprecated
    public static abstract class PropertyNamingStrategyBase extends PropertyNamingStrategy {
        public abstract String translate(String str);

        public static String translateLowerCaseWithSeparator(String str, char c11) {
            int length;
            if (str == null || (length = str.length()) == 0) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder((length >> 1) + length);
            int i11 = 0;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                char lowerCase = Character.toLowerCase(cCharAt);
                if (lowerCase == cCharAt) {
                    if (i11 > 1) {
                        sb2.insert(sb2.length() - 1, c11);
                    }
                    i11 = 0;
                } else {
                    if (i11 == 0 && i12 > 0) {
                        sb2.append(c11);
                    }
                    i11++;
                }
                sb2.append(lowerCase);
            }
            return sb2.toString();
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }

        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy
        public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
            return translate(str);
        }
    }

    @Deprecated
    public static class SnakeCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String translate(String str) {
            if (str == null) {
                return str;
            }
            int length = str.length();
            StringBuilder sb2 = new StringBuilder(length * 2);
            int i11 = 0;
            boolean z11 = false;
            for (int i12 = 0; i12 < length; i12++) {
                char cCharAt = str.charAt(i12);
                if (i12 > 0 || cCharAt != '_') {
                    if (Character.isUpperCase(cCharAt)) {
                        if (!z11 && i11 > 0 && sb2.charAt(i11 - 1) != '_') {
                            sb2.append('_');
                            i11++;
                        }
                        cCharAt = Character.toLowerCase(cCharAt);
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    sb2.append(cCharAt);
                    i11++;
                }
            }
            return i11 > 0 ? sb2.toString() : str;
        }
    }

    @Deprecated
    public static class UpperCamelCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String translate(String str) {
            char cCharAt;
            char upperCase;
            if (str == null || str.isEmpty() || cCharAt == (upperCase = Character.toUpperCase((cCharAt = str.charAt(0))))) {
                return str;
            }
            StringBuilder sb2 = new StringBuilder(str);
            sb2.setCharAt(0, upperCase);
            return sb2.toString();
        }
    }

    @Deprecated
    public static class LowerCaseStrategy extends PropertyNamingStrategyBase {
        @Override // com.fasterxml.jackson.databind.PropertyNamingStrategy.PropertyNamingStrategyBase
        public String translate(String str) {
            return str.toLowerCase();
        }
    }

    static {
        UpperCamelCaseStrategy upperCamelCaseStrategy = new UpperCamelCaseStrategy();
        UPPER_CAMEL_CASE = upperCamelCaseStrategy;
        SnakeCaseStrategy snakeCaseStrategy = new SnakeCaseStrategy();
        SNAKE_CASE = snakeCaseStrategy;
        LOWER_CASE = new LowerCaseStrategy();
        KEBAB_CASE = new KebabCaseStrategy();
        LOWER_DOT_CASE = new LowerDotCaseStrategy();
        CAMEL_CASE_TO_LOWER_CASE_WITH_UNDERSCORES = snakeCaseStrategy;
        PASCAL_CASE_TO_CAMEL_CASE = upperCamelCaseStrategy;
    }

    public String nameForConstructorParameter(MapperConfig<?> mapperConfig, AnnotatedParameter annotatedParameter, String str) {
        return str;
    }

    public String nameForField(MapperConfig<?> mapperConfig, AnnotatedField annotatedField, String str) {
        return str;
    }

    public String nameForGetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }

    public String nameForSetterMethod(MapperConfig<?> mapperConfig, AnnotatedMethod annotatedMethod, String str) {
        return str;
    }
}
