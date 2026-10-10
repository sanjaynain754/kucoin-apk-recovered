package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes34.dex */
@CheckReturnValue
final class OneofInfo {
    private final java.lang.reflect.Field caseField;

    /* JADX INFO: renamed from: id */
    private final int f2680id;
    private final java.lang.reflect.Field valueField;

    public java.lang.reflect.Field getCaseField() {
        return this.caseField;
    }

    public int getId() {
        return this.f2680id;
    }

    public java.lang.reflect.Field getValueField() {
        return this.valueField;
    }

    public OneofInfo(int i11, java.lang.reflect.Field field, java.lang.reflect.Field field2) {
        this.f2680id = i11;
        this.caseField = field;
        this.valueField = field2;
    }
}
