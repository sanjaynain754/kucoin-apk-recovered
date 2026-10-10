package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE, ElementType.METHOD, ElementType.CONSTRUCTOR, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonIgnoreProperties {

    public static class Value implements Serializable {
        protected static final Value EMPTY = new Value(Collections.EMPTY_SET, false, false, false, true);
        private static final long serialVersionUID = 1;
        protected final boolean _allowGetters;
        protected final boolean _allowSetters;
        protected final boolean _ignoreUnknown;
        protected final Set<String> _ignored;
        protected final boolean _merge;

        public static Value forIgnoredProperties(Set<String> set) {
            return EMPTY.withIgnored(set);
        }

        public static Value mergeAll(Value... valueArr) {
            Value value = null;
            for (Value valueWithOverrides : valueArr) {
                if (valueWithOverrides != null) {
                    if (value != null) {
                        valueWithOverrides = value.withOverrides(valueWithOverrides);
                    }
                    value = valueWithOverrides;
                }
            }
            return value;
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && m10773c(this, (Value) obj);
        }

        public Value withIgnored(Set<String> set) {
            return construct(set, this._ignoreUnknown, this._allowGetters, this._allowSetters, this._merge);
        }

        /* JADX INFO: renamed from: a */
        public static Set<String> m10771a(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.EMPTY_SET;
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                hashSet.add(str);
            }
            return hashSet;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m10772b(Set<String> set, boolean z11, boolean z12, boolean z13, boolean z14) {
            Value value = EMPTY;
            if (z11 == value._ignoreUnknown && z12 == value._allowGetters && z13 == value._allowSetters && z14 == value._merge) {
                return set == null || set.size() == 0;
            }
            return false;
        }

        /* JADX INFO: renamed from: c */
        public static boolean m10773c(Value value, Value value2) {
            return value._ignoreUnknown == value2._ignoreUnknown && value._merge == value2._merge && value._allowGetters == value2._allowGetters && value._allowSetters == value2._allowSetters && value._ignored.equals(value2._ignored);
        }

        public static Value empty() {
            return EMPTY;
        }

        public static Value forIgnoreUnknown(boolean z11) {
            return z11 ? EMPTY.withIgnoreUnknown() : EMPTY.withoutIgnoreUnknown();
        }

        public static Value forIgnoredProperties(String... strArr) {
            return strArr.length == 0 ? EMPTY : EMPTY.withIgnored(m10771a(strArr));
        }

        public static Value from(JsonIgnoreProperties jsonIgnoreProperties) {
            return jsonIgnoreProperties == null ? EMPTY : construct(m10771a(jsonIgnoreProperties.value()), jsonIgnoreProperties.ignoreUnknown(), jsonIgnoreProperties.allowGetters(), jsonIgnoreProperties.allowSetters(), false);
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public Set<String> findIgnoredForDeserialization() {
            return this._allowSetters ? Collections.EMPTY_SET : this._ignored;
        }

        public Set<String> findIgnoredForSerialization() {
            return this._allowGetters ? Collections.EMPTY_SET : this._ignored;
        }

        public boolean getAllowGetters() {
            return this._allowGetters;
        }

        public boolean getAllowSetters() {
            return this._allowSetters;
        }

        public boolean getIgnoreUnknown() {
            return this._ignoreUnknown;
        }

        public Set<String> getIgnored() {
            return this._ignored;
        }

        public boolean getMerge() {
            return this._merge;
        }

        public int hashCode() {
            return this._ignored.size() + (this._ignoreUnknown ? 1 : -3) + (this._allowGetters ? 3 : -7) + (this._allowSetters ? 7 : -11) + (this._merge ? 11 : -13);
        }

        public Object readResolve() {
            return m10772b(this._ignored, this._ignoreUnknown, this._allowGetters, this._allowSetters, this._merge) ? EMPTY : this;
        }

        public String toString() {
            return String.format("JsonIgnoreProperties.Value(ignored=%s,ignoreUnknown=%s,allowGetters=%s,allowSetters=%s,merge=%s)", this._ignored, Boolean.valueOf(this._ignoreUnknown), Boolean.valueOf(this._allowGetters), Boolean.valueOf(this._allowSetters), Boolean.valueOf(this._merge));
        }

        public Class<JsonIgnoreProperties> valueFor() {
            return JsonIgnoreProperties.class;
        }

        public Value withAllowGetters() {
            return this._allowGetters ? this : construct(this._ignored, this._ignoreUnknown, true, this._allowSetters, this._merge);
        }

        public Value withAllowSetters() {
            return this._allowSetters ? this : construct(this._ignored, this._ignoreUnknown, this._allowGetters, true, this._merge);
        }

        public Value withIgnoreUnknown() {
            return this._ignoreUnknown ? this : construct(this._ignored, true, this._allowGetters, this._allowSetters, this._merge);
        }

        public Value withIgnored(String... strArr) {
            return construct(m10771a(strArr), this._ignoreUnknown, this._allowGetters, this._allowSetters, this._merge);
        }

        public Value withMerge() {
            return this._merge ? this : construct(this._ignored, this._ignoreUnknown, this._allowGetters, this._allowSetters, true);
        }

        public Value withOverrides(Value value) {
            if (value != null && value != EMPTY) {
                if (!value._merge) {
                    return value;
                }
                if (!m10773c(this, value)) {
                    return construct(m10774d(this._ignored, value._ignored), this._ignoreUnknown || value._ignoreUnknown, this._allowGetters || value._allowGetters, this._allowSetters || value._allowSetters, true);
                }
            }
            return this;
        }

        public Value withoutAllowGetters() {
            return !this._allowGetters ? this : construct(this._ignored, this._ignoreUnknown, false, this._allowSetters, this._merge);
        }

        public Value withoutAllowSetters() {
            return !this._allowSetters ? this : construct(this._ignored, this._ignoreUnknown, this._allowGetters, false, this._merge);
        }

        public Value withoutIgnoreUnknown() {
            return !this._ignoreUnknown ? this : construct(this._ignored, false, this._allowGetters, this._allowSetters, this._merge);
        }

        public Value withoutIgnored() {
            return construct(null, this._ignoreUnknown, this._allowGetters, this._allowSetters, this._merge);
        }

        public Value withoutMerge() {
            return !this._merge ? this : construct(this._ignored, this._ignoreUnknown, this._allowGetters, this._allowSetters, false);
        }

        public Value(Set<String> set, boolean z11, boolean z12, boolean z13, boolean z14) {
            if (set == null) {
                this._ignored = Collections.EMPTY_SET;
            } else {
                this._ignored = set;
            }
            this._ignoreUnknown = z11;
            this._allowGetters = z12;
            this._allowSetters = z13;
            this._merge = z14;
        }

        public static Value construct(Set<String> set, boolean z11, boolean z12, boolean z13, boolean z14) {
            if (m10772b(set, z11, z12, z13, z14)) {
                return EMPTY;
            }
            return new Value(set, z11, z12, z13, z14);
        }

        /* JADX INFO: renamed from: d */
        public static Set<String> m10774d(Set<String> set, Set<String> set2) {
            if (set.isEmpty()) {
                return set2;
            }
            if (set2.isEmpty()) {
                return set;
            }
            HashSet hashSet = new HashSet(set.size() + set2.size());
            hashSet.addAll(set);
            hashSet.addAll(set2);
            return hashSet;
        }
    }

    boolean allowGetters() default false;

    boolean allowSetters() default false;

    boolean ignoreUnknown() default false;

    String[] value() default {};
}
