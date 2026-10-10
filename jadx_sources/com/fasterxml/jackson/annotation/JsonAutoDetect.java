package com.fasterxml.jackson.annotation;

import java.io.Serializable;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;

/* JADX INFO: loaded from: classes45.dex */
@Target({ElementType.ANNOTATION_TYPE, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JsonAutoDetect {

    public static class Value implements Serializable {
        protected static final Value DEFAULT;
        protected static final Value NO_OVERRIDES;

        /* JADX INFO: renamed from: b */
        public static final Visibility f9993b;
        private static final long serialVersionUID = 1;
        protected final Visibility _creatorVisibility;
        protected final Visibility _fieldVisibility;
        protected final Visibility _getterVisibility;
        protected final Visibility _isGetterVisibility;
        protected final Visibility _setterVisibility;

        public static Value construct(PropertyAccessor propertyAccessor, Visibility visibility) {
            Visibility visibility2;
            Visibility visibility3;
            Visibility visibility4;
            Visibility visibility5 = Visibility.DEFAULT;
            int i11 = C6263a.f9996b[propertyAccessor.ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    visibility3 = visibility5;
                    visibility4 = visibility3;
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        visibility3 = visibility;
                        visibility = visibility5;
                    } else if (i11 == 6) {
                        visibility4 = visibility;
                        visibility3 = visibility5;
                        visibility = visibility3;
                        visibility2 = visibility;
                    } else if (i11 != 7) {
                        visibility3 = visibility5;
                        visibility = visibility3;
                    } else {
                        visibility3 = visibility;
                        visibility5 = visibility3;
                        visibility4 = visibility5;
                    }
                    visibility4 = visibility;
                } else {
                    visibility3 = visibility5;
                    visibility4 = visibility3;
                    visibility2 = visibility4;
                    visibility5 = visibility;
                    visibility = visibility2;
                }
                visibility2 = visibility4;
            } else {
                visibility2 = visibility;
                visibility3 = visibility5;
                visibility = visibility3;
                visibility4 = visibility;
            }
            return construct(visibility, visibility5, visibility3, visibility4, visibility2);
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            return obj != null && obj.getClass() == getClass() && m10761a(this, (Value) obj);
        }

        static {
            Visibility visibility = Visibility.PUBLIC_ONLY;
            f9993b = visibility;
            DEFAULT = new Value(visibility, visibility, visibility, Visibility.ANY, visibility);
            Visibility visibility2 = Visibility.DEFAULT;
            NO_OVERRIDES = new Value(visibility2, visibility2, visibility2, visibility2, visibility2);
        }

        /* JADX INFO: renamed from: a */
        public static boolean m10761a(Value value, Value value2) {
            return value._fieldVisibility == value2._fieldVisibility && value._getterVisibility == value2._getterVisibility && value._isGetterVisibility == value2._isGetterVisibility && value._setterVisibility == value2._setterVisibility && value._creatorVisibility == value2._creatorVisibility;
        }

        /* JADX INFO: renamed from: b */
        public static Value m10762b(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            if (visibility == f9993b) {
                Value value = DEFAULT;
                if (visibility2 == value._getterVisibility && visibility3 == value._isGetterVisibility && visibility4 == value._setterVisibility && visibility5 == value._creatorVisibility) {
                    return value;
                }
                return null;
            }
            Visibility visibility6 = Visibility.DEFAULT;
            if (visibility == visibility6 && visibility2 == visibility6 && visibility3 == visibility6 && visibility4 == visibility6 && visibility5 == visibility6) {
                return NO_OVERRIDES;
            }
            return null;
        }

        public static Value defaultVisibility() {
            return DEFAULT;
        }

        public static Value merge(Value value, Value value2) {
            return value == null ? value2 : value.withOverrides(value2);
        }

        public static Value noOverrides() {
            return NO_OVERRIDES;
        }

        public Visibility getCreatorVisibility() {
            return this._creatorVisibility;
        }

        public Visibility getFieldVisibility() {
            return this._fieldVisibility;
        }

        public Visibility getGetterVisibility() {
            return this._getterVisibility;
        }

        public Visibility getIsGetterVisibility() {
            return this._isGetterVisibility;
        }

        public Visibility getSetterVisibility() {
            return this._setterVisibility;
        }

        public int hashCode() {
            return ((this._fieldVisibility.ordinal() + 1) ^ (((this._getterVisibility.ordinal() * 3) - (this._isGetterVisibility.ordinal() * 7)) + (this._setterVisibility.ordinal() * 11))) ^ (this._creatorVisibility.ordinal() * 13);
        }

        public Object readResolve() {
            Value valueM10762b = m10762b(this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
            return valueM10762b == null ? this : valueM10762b;
        }

        public String toString() {
            return String.format("JsonAutoDetect.Value(fields=%s,getters=%s,isGetters=%s,setters=%s,creators=%s)", this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
        }

        public Class<JsonAutoDetect> valueFor() {
            return JsonAutoDetect.class;
        }

        public Value withCreatorVisibility(Visibility visibility) {
            return construct(this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, visibility);
        }

        public Value withFieldVisibility(Visibility visibility) {
            return construct(visibility, this._getterVisibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
        }

        public Value withGetterVisibility(Visibility visibility) {
            return construct(this._fieldVisibility, visibility, this._isGetterVisibility, this._setterVisibility, this._creatorVisibility);
        }

        public Value withIsGetterVisibility(Visibility visibility) {
            return construct(this._fieldVisibility, this._getterVisibility, visibility, this._setterVisibility, this._creatorVisibility);
        }

        public Value withOverrides(Value value) {
            if (value == null || value == NO_OVERRIDES || value == this || m10761a(this, value)) {
                return this;
            }
            Visibility visibility = value._fieldVisibility;
            Visibility visibility2 = Visibility.DEFAULT;
            if (visibility == visibility2) {
                visibility = this._fieldVisibility;
            }
            Visibility visibility3 = value._getterVisibility;
            if (visibility3 == visibility2) {
                visibility3 = this._getterVisibility;
            }
            Visibility visibility4 = value._isGetterVisibility;
            if (visibility4 == visibility2) {
                visibility4 = this._isGetterVisibility;
            }
            Visibility visibility5 = value._setterVisibility;
            if (visibility5 == visibility2) {
                visibility5 = this._setterVisibility;
            }
            Visibility visibility6 = value._creatorVisibility;
            if (visibility6 == visibility2) {
                visibility6 = this._creatorVisibility;
            }
            return construct(visibility, visibility3, visibility4, visibility5, visibility6);
        }

        public Value withSetterVisibility(Visibility visibility) {
            return construct(this._fieldVisibility, this._getterVisibility, this._isGetterVisibility, visibility, this._creatorVisibility);
        }

        public Value(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            this._fieldVisibility = visibility;
            this._getterVisibility = visibility2;
            this._isGetterVisibility = visibility3;
            this._setterVisibility = visibility4;
            this._creatorVisibility = visibility5;
        }

        public static Value from(JsonAutoDetect jsonAutoDetect) {
            return construct(jsonAutoDetect.fieldVisibility(), jsonAutoDetect.getterVisibility(), jsonAutoDetect.isGetterVisibility(), jsonAutoDetect.setterVisibility(), jsonAutoDetect.creatorVisibility());
        }

        public static Value construct(Visibility visibility, Visibility visibility2, Visibility visibility3, Visibility visibility4, Visibility visibility5) {
            Value valueM10762b = m10762b(visibility, visibility2, visibility3, visibility4, visibility5);
            return valueM10762b == null ? new Value(visibility, visibility2, visibility3, visibility4, visibility5) : valueM10762b;
        }
    }

    public enum Visibility {
        ANY,
        NON_PRIVATE,
        PROTECTED_AND_PUBLIC,
        PUBLIC_ONLY,
        NONE,
        DEFAULT;

        public boolean isVisible(Member member) {
            int i11 = C6263a.f9995a[ordinal()];
            if (i11 == 1) {
                return true;
            }
            if (i11 == 3) {
                return !Modifier.isPrivate(member.getModifiers());
            }
            if (i11 != 4) {
                if (i11 != 5) {
                    return false;
                }
            } else if (Modifier.isProtected(member.getModifiers())) {
                return true;
            }
            return Modifier.isPublic(member.getModifiers());
        }
    }

    Visibility creatorVisibility() default Visibility.DEFAULT;

    Visibility fieldVisibility() default Visibility.DEFAULT;

    Visibility getterVisibility() default Visibility.DEFAULT;

    Visibility isGetterVisibility() default Visibility.DEFAULT;

    Visibility setterVisibility() default Visibility.DEFAULT;

    /* JADX INFO: renamed from: com.fasterxml.jackson.annotation.JsonAutoDetect$a */
    public static /* synthetic */ class C6263a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f9995a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f9996b;

        static {
            int[] iArr = new int[PropertyAccessor.values().length];
            f9996b = iArr;
            try {
                iArr[PropertyAccessor.CREATOR.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f9996b[PropertyAccessor.FIELD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f9996b[PropertyAccessor.GETTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f9996b[PropertyAccessor.IS_GETTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f9996b[PropertyAccessor.NONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f9996b[PropertyAccessor.SETTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f9996b[PropertyAccessor.ALL.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr2 = new int[Visibility.values().length];
            f9995a = iArr2;
            try {
                iArr2[Visibility.ANY.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f9995a[Visibility.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f9995a[Visibility.NON_PRIVATE.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f9995a[Visibility.PROTECTED_AND_PUBLIC.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f9995a[Visibility.PUBLIC_ONLY.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }
}
