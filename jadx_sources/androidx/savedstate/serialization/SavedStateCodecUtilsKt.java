package androidx.savedstate.serialization;

import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.IntCompanionObject;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.jvm.internal.StringCompanionObject;
import ug0.C45236a;
import vg0.InterfaceC45533f;

/* JADX INFO: compiled from: SavedStateCodecUtils.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0017\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\"\u001a\u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0002\u001a\u0004\b\f\u0010\u0004\"\u001a\u0010\r\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u0002\u001a\u0004\b\u000e\u0010\u0004\"\u001a\u0010\u000f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0011\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0002\u001a\u0004\b\u0012\u0010\u0004\" \u0010\u0013\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0002\u0012\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, m90084d2 = {"Lvg0/f;", "intListDescriptor", "Lvg0/f;", "getIntListDescriptor", "()Lvg0/f;", "stringListDescriptor", "getStringListDescriptor", "booleanArrayDescriptor", "getBooleanArrayDescriptor", "charArrayDescriptor", "getCharArrayDescriptor", "doubleArrayDescriptor", "getDoubleArrayDescriptor", "floatArrayDescriptor", "getFloatArrayDescriptor", "intArrayDescriptor", "getIntArrayDescriptor", "longArrayDescriptor", "getLongArrayDescriptor", "stringArrayDescriptor", "getStringArrayDescriptor", "getStringArrayDescriptor$annotations", "()V", "savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateCodecUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateCodecUtils.kt\nandroidx/savedstate/serialization/SavedStateCodecUtilsKt\n+ 2 BuiltinSerializers.kt\nkotlinx/serialization/builtins/BuiltinSerializersKt\n*L\n1#1,41:1\n194#2:42\n*S KotlinDebug\n*F\n+ 1 SavedStateCodecUtils.kt\nandroidx/savedstate/serialization/SavedStateCodecUtilsKt\n*L\n40#1:42\n*E\n"})
public final class SavedStateCodecUtilsKt {

    @NotNull
    private static final InterfaceC45533f booleanArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f charArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f doubleArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f floatArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f intArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f intListDescriptor = C45236a.m99956h(C45236a.serializer(IntCompanionObject.INSTANCE)).getDescriptor();

    @NotNull
    private static final InterfaceC45533f longArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f stringArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f stringListDescriptor;

    static {
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        stringListDescriptor = C45236a.m99956h(C45236a.serializer(stringCompanionObject)).getDescriptor();
        booleanArrayDescriptor = C45236a.m99950b().getDescriptor();
        charArrayDescriptor = C45236a.m99952d().getDescriptor();
        doubleArrayDescriptor = C45236a.m99953e().getDescriptor();
        floatArrayDescriptor = C45236a.m99954f().getDescriptor();
        intArrayDescriptor = C45236a.m99955g().getDescriptor();
        longArrayDescriptor = C45236a.m99957i().getDescriptor();
        stringArrayDescriptor = C45236a.m99949a(Reflection.getOrCreateKotlinClass(String.class), C45236a.serializer(stringCompanionObject)).getDescriptor();
    }

    @NotNull
    public static final InterfaceC45533f getBooleanArrayDescriptor() {
        return booleanArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getCharArrayDescriptor() {
        return charArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getDoubleArrayDescriptor() {
        return doubleArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getFloatArrayDescriptor() {
        return floatArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getIntArrayDescriptor() {
        return intArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getIntListDescriptor() {
        return intListDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getLongArrayDescriptor() {
        return longArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getStringArrayDescriptor() {
        return stringArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getStringListDescriptor() {
        return stringListDescriptor;
    }

    public static /* synthetic */ void getStringArrayDescriptor$annotations() {
    }
}
