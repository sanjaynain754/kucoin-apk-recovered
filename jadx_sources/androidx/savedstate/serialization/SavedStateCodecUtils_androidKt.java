package androidx.savedstate.serialization;

import android.os.IBinder;
import android.os.Parcelable;
import androidx.savedstate.serialization.serializers.CharSequenceSerializer;
import androidx.savedstate.serialization.serializers.DefaultParcelableSerializer;
import androidx.savedstate.serialization.serializers.SparseArraySerializer;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.C44955h;
import ug0.C45236a;
import vg0.InterfaceC45533f;

/* JADX INFO: compiled from: SavedStateCodecUtils.android.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b&\"\u001a\u0010\u0001\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0004\"\u001a\u0010\u0007\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0002\u001a\u0004\b\b\u0010\u0004\"\u001a\u0010\t\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\u0002\u001a\u0004\b\n\u0010\u0004\" \u0010\u000b\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\u0002\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\f\u0010\u0004\" \u0010\u000f\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u000f\u0010\u0002\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0010\u0010\u0004\"\u001a\u0010\u0012\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0002\u001a\u0004\b\u0013\u0010\u0004\"\u001a\u0010\u0014\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0002\u001a\u0004\b\u0015\u0010\u0004\" \u0010\u0016\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0016\u0010\u0002\u0012\u0004\b\u0018\u0010\u000e\u001a\u0004\b\u0017\u0010\u0004\" \u0010\u0019\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\u0002\u0012\u0004\b\u001b\u0010\u000e\u001a\u0004\b\u001a\u0010\u0004\"\u001a\u0010\u001c\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u0002\u001a\u0004\b\u001d\u0010\u0004\"\u001a\u0010\u001e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u0002\u001a\u0004\b\u001f\u0010\u0004\"\u001a\u0010 \u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0002\u001a\u0004\b!\u0010\u0004\"\u001a\u0010\"\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010\u0002\u001a\u0004\b#\u0010\u0004\"\u001a\u0010$\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b$\u0010\u0002\u001a\u0004\b%\u0010\u0004¨\u0006&"}, m90084d2 = {"Lvg0/f;", "polymorphicCharSequenceDescriptor", "Lvg0/f;", "getPolymorphicCharSequenceDescriptor", "()Lvg0/f;", "polymorphicParcelableDescriptor", "getPolymorphicParcelableDescriptor", "polymorphicJavaSerializableDescriptor", "getPolymorphicJavaSerializableDescriptor", "polymorphicIBinderDescriptor", "getPolymorphicIBinderDescriptor", "parcelableArrayDescriptor", "getParcelableArrayDescriptor", "getParcelableArrayDescriptor$annotations", "()V", "polymorphicParcelableArrayDescriptor", "getPolymorphicParcelableArrayDescriptor", "getPolymorphicParcelableArrayDescriptor$annotations", "parcelableListDescriptor", "getParcelableListDescriptor", "polymorphicParcelableListDescriptor", "getPolymorphicParcelableListDescriptor", "charSequenceArrayDescriptor", "getCharSequenceArrayDescriptor", "getCharSequenceArrayDescriptor$annotations", "polymorphicCharSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor", "getPolymorphicCharSequenceArrayDescriptor$annotations", "charSequenceListDescriptor", "getCharSequenceListDescriptor", "polymorphicCharSequenceListDescriptor", "getPolymorphicCharSequenceListDescriptor", "sparseParcelableArrayDescriptor", "getSparseParcelableArrayDescriptor", "polymorphicSparseParcelableArrayDescriptor", "getPolymorphicSparseParcelableArrayDescriptor", "nullablePolymorphicSparseParcelableArrayDescriptor", "getNullablePolymorphicSparseParcelableArrayDescriptor", "savedstate_release"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateCodecUtils.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateCodecUtils.android.kt\nandroidx/savedstate/serialization/SavedStateCodecUtils_androidKt\n+ 2 BuiltinSerializers.kt\nkotlinx/serialization/builtins/BuiltinSerializersKt\n*L\n1#1,67:1\n194#2:68\n194#2:69\n194#2:70\n194#2:71\n*S KotlinDebug\n*F\n+ 1 SavedStateCodecUtils.android.kt\nandroidx/savedstate/serialization/SavedStateCodecUtils_androidKt\n*L\n42#1:68\n45#1:69\n52#1:70\n55#1:71\n*E\n"})
public final class SavedStateCodecUtils_androidKt {

    @NotNull
    private static final InterfaceC45533f charSequenceArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f charSequenceListDescriptor;

    @NotNull
    private static final InterfaceC45533f nullablePolymorphicSparseParcelableArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f parcelableArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f parcelableListDescriptor;

    @NotNull
    private static final InterfaceC45533f polymorphicCharSequenceArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f polymorphicCharSequenceListDescriptor;

    @NotNull
    private static final InterfaceC45533f polymorphicParcelableArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f polymorphicParcelableListDescriptor;

    @NotNull
    private static final InterfaceC45533f polymorphicSparseParcelableArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f sparseParcelableArrayDescriptor;

    @NotNull
    private static final InterfaceC45533f polymorphicCharSequenceDescriptor = new C44955h(Reflection.getOrCreateKotlinClass(CharSequence.class)).getDescriptor();

    @NotNull
    private static final InterfaceC45533f polymorphicParcelableDescriptor = new C44955h(Reflection.getOrCreateKotlinClass(Parcelable.class)).getDescriptor();

    @NotNull
    private static final InterfaceC45533f polymorphicJavaSerializableDescriptor = new C44955h(Reflection.getOrCreateKotlinClass(Serializable.class)).getDescriptor();

    @NotNull
    private static final InterfaceC45533f polymorphicIBinderDescriptor = new C44955h(Reflection.getOrCreateKotlinClass(IBinder.class)).getDescriptor();

    static {
        DefaultParcelableSerializer defaultParcelableSerializer = DefaultParcelableSerializer.INSTANCE;
        parcelableArrayDescriptor = C45236a.m99949a(Reflection.getOrCreateKotlinClass(Parcelable.class), defaultParcelableSerializer).getDescriptor();
        polymorphicParcelableArrayDescriptor = C45236a.m99949a(Reflection.getOrCreateKotlinClass(Parcelable.class), new C44955h(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        parcelableListDescriptor = C45236a.m99956h(defaultParcelableSerializer).getDescriptor();
        polymorphicParcelableListDescriptor = C45236a.m99956h(new C44955h(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        CharSequenceSerializer charSequenceSerializer = CharSequenceSerializer.INSTANCE;
        charSequenceArrayDescriptor = C45236a.m99949a(Reflection.getOrCreateKotlinClass(CharSequence.class), charSequenceSerializer).getDescriptor();
        polymorphicCharSequenceArrayDescriptor = C45236a.m99949a(Reflection.getOrCreateKotlinClass(CharSequence.class), new C44955h(Reflection.getOrCreateKotlinClass(CharSequence.class))).getDescriptor();
        charSequenceListDescriptor = C45236a.m99956h(charSequenceSerializer).getDescriptor();
        polymorphicCharSequenceListDescriptor = C45236a.m99956h(new C44955h(Reflection.getOrCreateKotlinClass(CharSequence.class))).getDescriptor();
        sparseParcelableArrayDescriptor = new SparseArraySerializer(defaultParcelableSerializer).getDescriptor();
        polymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(new C44955h(Reflection.getOrCreateKotlinClass(Parcelable.class))).getDescriptor();
        nullablePolymorphicSparseParcelableArrayDescriptor = new SparseArraySerializer(C45236a.m99969u(new C44955h(Reflection.getOrCreateKotlinClass(Parcelable.class)))).getDescriptor();
    }

    @NotNull
    public static final InterfaceC45533f getCharSequenceArrayDescriptor() {
        return charSequenceArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getCharSequenceListDescriptor() {
        return charSequenceListDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getNullablePolymorphicSparseParcelableArrayDescriptor() {
        return nullablePolymorphicSparseParcelableArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getParcelableArrayDescriptor() {
        return parcelableArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getParcelableListDescriptor() {
        return parcelableListDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getPolymorphicCharSequenceArrayDescriptor() {
        return polymorphicCharSequenceArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getPolymorphicCharSequenceDescriptor() {
        return polymorphicCharSequenceDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getPolymorphicCharSequenceListDescriptor() {
        return polymorphicCharSequenceListDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getPolymorphicIBinderDescriptor() {
        return polymorphicIBinderDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getPolymorphicJavaSerializableDescriptor() {
        return polymorphicJavaSerializableDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getPolymorphicParcelableArrayDescriptor() {
        return polymorphicParcelableArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getPolymorphicParcelableDescriptor() {
        return polymorphicParcelableDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getPolymorphicParcelableListDescriptor() {
        return polymorphicParcelableListDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getPolymorphicSparseParcelableArrayDescriptor() {
        return polymorphicSparseParcelableArrayDescriptor;
    }

    @NotNull
    public static final InterfaceC45533f getSparseParcelableArrayDescriptor() {
        return sparseParcelableArrayDescriptor;
    }

    public static /* synthetic */ void getCharSequenceArrayDescriptor$annotations() {
    }

    public static /* synthetic */ void getParcelableArrayDescriptor$annotations() {
    }

    public static /* synthetic */ void getPolymorphicCharSequenceArrayDescriptor$annotations() {
    }

    public static /* synthetic */ void getPolymorphicParcelableArrayDescriptor$annotations() {
    }
}
