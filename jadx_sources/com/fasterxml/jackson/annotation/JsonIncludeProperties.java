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
public @interface JsonIncludeProperties {

    public static class Value implements Serializable {
        protected static final Value ALL = new Value(null);
        private static final long serialVersionUID = 1;
        protected final Set<String> _included;

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && m10776b(this._included, ((Value) obj)._included);
        }

        /* JADX INFO: renamed from: a */
        public static Set<String> m10775a(String[] strArr) {
            if (strArr == null || strArr.length == 0) {
                return Collections.EMPTY_SET;
            }
            HashSet hashSet = new HashSet(strArr.length);
            for (String str : strArr) {
                hashSet.add(str);
            }
            return hashSet;
        }

        public static Value all() {
            return ALL;
        }

        /* JADX INFO: renamed from: b */
        public static boolean m10776b(Set<String> set, Set<String> set2) {
            if (set == null) {
                return set2 == null;
            }
            return set.equals(set2);
        }

        public static Value from(JsonIncludeProperties jsonIncludeProperties) {
            return jsonIncludeProperties == null ? ALL : new Value(m10775a(jsonIncludeProperties.value()));
        }

        public Set<String> getIncluded() {
            return this._included;
        }

        public int hashCode() {
            Set<String> set = this._included;
            if (set == null) {
                return 0;
            }
            return set.size();
        }

        public String toString() {
            return String.format("JsonIncludeProperties.Value(included=%s)", this._included);
        }

        public Class<JsonIncludeProperties> valueFor() {
            return JsonIncludeProperties.class;
        }

        public Value withOverrides(Value value) {
            Set<String> included;
            if (value == null || (included = value.getIncluded()) == null) {
                return this;
            }
            if (this._included == null) {
                return value;
            }
            HashSet hashSet = new HashSet();
            for (String str : included) {
                if (this._included.contains(str)) {
                    hashSet.add(str);
                }
            }
            return new Value(hashSet);
        }

        public Value(Set<String> set) {
            this._included = set;
        }
    }

    String[] value() default {};
}
