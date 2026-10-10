package p424l7;

/* JADX INFO: renamed from: l7.a */
/* JADX INFO: compiled from: ResolvedType.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC42115a {
    public abstract AbstractC42115a containedType(int i11);

    public abstract int containedTypeCount();

    public abstract String containedTypeName(int i11);

    public abstract AbstractC42115a getContentType();

    public abstract AbstractC42115a getKeyType();

    @Deprecated
    public Class<?> getParameterSource() {
        return null;
    }

    public abstract Class<?> getRawClass();

    public abstract AbstractC42115a getReferencedType();

    public abstract boolean hasGenericTypes();

    public abstract boolean hasRawClass(Class<?> cls);

    public abstract boolean isAbstract();

    public abstract boolean isArrayType();

    public abstract boolean isCollectionLikeType();

    public abstract boolean isConcrete();

    public abstract boolean isContainerType();

    public abstract boolean isEnumType();

    public abstract boolean isFinal();

    public abstract boolean isInterface();

    public abstract boolean isMapLikeType();

    public abstract boolean isPrimitive();

    public abstract boolean isThrowable();

    public abstract String toCanonical();

    public boolean isReferenceType() {
        if (getReferencedType() != null) {
            return true;
        }
        return false;
    }
}
