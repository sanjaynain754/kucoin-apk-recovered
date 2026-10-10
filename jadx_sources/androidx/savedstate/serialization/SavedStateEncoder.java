package androidx.savedstate.serialization;

import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.exifinterface.media.ExifInterface;
import androidx.savedstate.SavedStateReader;
import androidx.savedstate.SavedStateWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.TuplesKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.InterfaceC44963p;
import vg0.AbstractC45542o;
import vg0.InterfaceC45533f;
import wg0.AbstractC45828a;
import wg0.InterfaceC45829b;
import yg0.AbstractC46494a;

/* JADX INFO: compiled from: SavedStateEncoder.kt */
/* JADX INFO: loaded from: classes34.dex */
@Metadata(m90083d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\n\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\f\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001b\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\f\u001a\u00020\u000b2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001d\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0013\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u000eH\u0002¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020#H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u00020\u000b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0&H\u0002¢\u0006\u0004\b'\u0010(J+\u0010+\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010*\u001a\u00020)2\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\u0002¢\u0006\u0004\b+\u0010,J+\u00101\u001a\u000200\"\u0004\b\u0000\u0010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010\u0010\u001a\u00028\u0000H\u0002¢\u0006\u0004\b1\u00102J\u001f\u00104\u001a\u0002002\u0006\u0010*\u001a\u00020)2\u0006\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b4\u00105J\u001f\u00106\u001a\u0002002\u0006\u0010*\u001a\u00020)2\u0006\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\b6\u00105J\u0017\u00107\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u000200H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u000209H\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010=\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020<H\u0016¢\u0006\u0004\b=\u0010>J\u0017\u0010?\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b?\u0010@J\u0017\u0010B\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010IJ\u0017\u0010K\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\tH\u0016¢\u0006\u0004\bM\u0010NJ\u001f\u0010P\u001a\u00020\u000b2\u0006\u0010O\u001a\u00020)2\u0006\u00103\u001a\u00020\u000fH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u000bH\u0016¢\u0006\u0004\bR\u0010SJ\u0017\u0010U\u001a\u00020T2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\bU\u0010VJ+\u0010W\u001a\u00020\u000b\"\u0004\b\u0000\u0010-2\f\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000.2\u0006\u0010\u0010\u001a\u00028\u0000H\u0016¢\u0006\u0004\bW\u0010XR\u001e\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0004\u0010Y\u001a\u0004\bZ\u0010[R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\\R$\u0010]\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\u001a\u0010b\u001a\u00020a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e¨\u0006f"}, m90084d2 = {"Landroidx/savedstate/serialization/SavedStateEncoder;", "Lwg0/a;", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "savedState", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "configuration", "<init>", "(Landroid/os/Bundle;Landroidx/savedstate/serialization/SavedStateConfiguration;)V", "", "elementName", "", "checkDiscriminatorCollisions", "(Landroid/os/Bundle;Ljava/lang/String;)V", "", "", "value", "encodeIntList", "(Ljava/util/List;)V", "encodeStringList", "", "encodeBooleanArray", "([Z)V", "", "encodeCharArray", "([C)V", "", "encodeDoubleArray", "([D)V", "", "encodeFloatArray", "([F)V", "", "encodeIntArray", "([I)V", "", "encodeLongArray", "([J)V", "", "encodeStringArray", "([Ljava/lang/String;)V", "Lvg0/f;", "descriptor", "putClassDiscriminatorIfRequired", "(Landroidx/savedstate/serialization/SavedStateConfiguration;Lvg0/f;Landroid/os/Bundle;)V", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/p;", "serializer", "", "encodeFormatSpecificTypes", "(Ltg0/p;Ljava/lang/Object;)Z", "index", "shouldEncodeElementDefault", "(Lvg0/f;I)Z", "encodeElement", "encodeBoolean", "(Z)V", "", "encodeByte", "(B)V", "", "encodeShort", "(S)V", "encodeInt", "(I)V", "", "encodeLong", "(J)V", "", "encodeFloat", "(F)V", "", "encodeDouble", "(D)V", "", "encodeChar", "(C)V", "encodeString", "(Ljava/lang/String;)V", "enumDescriptor", "encodeEnum", "(Lvg0/f;I)V", "encodeNull", "()V", "Lwg0/b;", "beginStructure", "(Lvg0/f;)Lwg0/b;", "encodeSerializableValue", "(Ltg0/p;Ljava/lang/Object;)V", "Landroid/os/Bundle;", "getSavedState$savedstate_release", "()Landroid/os/Bundle;", "Landroidx/savedstate/serialization/SavedStateConfiguration;", "key", "Ljava/lang/String;", "getKey$savedstate_release", "()Ljava/lang/String;", "Lyg0/a;", "serializersModule", "Lyg0/a;", "getSerializersModule", "()Lyg0/a;", "savedstate_release"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSavedStateEncoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoder\n+ 2 SavedState.kt\nandroidx/savedstate/SavedStateKt__SavedStateKt\n+ 3 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt\n+ 4 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 5 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 SavedState.android.kt\nandroidx/savedstate/SavedStateKt__SavedState_androidKt$savedState$1\n*L\n1#1,281:1\n90#2:282\n90#2:283\n106#2:284\n106#2:285\n106#2:286\n106#2:287\n106#2:288\n106#2:289\n106#2:290\n106#2:291\n106#2:292\n106#2:293\n106#2:294\n106#2:295\n106#2:296\n106#2:297\n106#2:298\n106#2:299\n106#2:300\n106#2:301\n106#2:302\n106#2:303\n106#2:324\n106#2:326\n90#2:327\n106#2:328\n27#3:304\n46#3:305\n32#3,4:306\n31#3,7:316\n126#4:310\n153#4,3:311\n37#5,2:314\n1#6:323\n46#7:325\n*S KotlinDebug\n*F\n+ 1 SavedStateEncoder.kt\nandroidx/savedstate/serialization/SavedStateEncoder\n*L\n108#1:282\n111#1:283\n122#1:284\n126#1:285\n130#1:286\n134#1:287\n138#1:288\n142#1:289\n146#1:290\n150#1:291\n154#1:292\n158#1:293\n162#1:294\n166#1:295\n170#1:296\n174#1:297\n178#1:298\n182#1:299\n186#1:300\n190#1:301\n194#1:302\n198#1:303\n211#1:324\n212#1:326\n229#1:327\n234#1:328\n211#1:304\n211#1:305\n211#1:306,4\n211#1:316,7\n211#1:310\n211#1:311,3\n211#1:314,2\n211#1:323\n211#1:325\n*E\n"})
public final class SavedStateEncoder extends AbstractC45828a {

    @NotNull
    private final SavedStateConfiguration configuration;

    @NotNull
    private String key;

    @NotNull
    private final Bundle savedState;

    @NotNull
    private final AbstractC46494a serializersModule;

    private final void checkDiscriminatorCollisions(Bundle savedState, String elementName) {
        if (this.configuration.getClassDiscriminatorMode() == 1) {
            boolean zM103590containsimpl = SavedStateReader.m103590containsimpl(SavedStateReader.m103589constructorimpl(savedState), "type");
            boolean zAreEqual = Intrinsics.areEqual(elementName, "type");
            if (zM103590containsimpl && zAreEqual) {
                throw new IllegalArgumentException("SavedStateEncoder for " + SavedStateReader.m103660getStringimpl(SavedStateReader.m103589constructorimpl(savedState), "type") + " has property '" + elementName + "' that conflicts with the class discriminator. You can rename a property with @SerialName annotation.");
            }
        }
    }

    private final void encodeBooleanArray(boolean[] value) {
        SavedStateWriter.m103682putBooleanArrayimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeCharArray(char[] value) {
        SavedStateWriter.m103684putCharArrayimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeDoubleArray(double[] value) {
        SavedStateWriter.m103689putDoubleArrayimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeFloatArray(float[] value) {
        SavedStateWriter.m103691putFloatArrayimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeIntArray(int[] value) {
        SavedStateWriter.m103693putIntArrayimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeIntList(List<Integer> value) {
        SavedStateWriter.m103694putIntListimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeLongArray(long[] value) {
        SavedStateWriter.m103697putLongArrayimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeStringArray(String[] value) {
        SavedStateWriter.m103709putStringArrayimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    private final void encodeStringList(List<String> value) {
        SavedStateWriter.m103710putStringListimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    @NotNull
    public InterfaceC45829b beginStructure(@NotNull InterfaceC45533f descriptor) {
        Pair[] pairArr;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        if (Intrinsics.areEqual(this.key, "")) {
            putClassDiscriminatorIfRequired(this.configuration, descriptor, this.savedState);
            return this;
        }
        Map mapEmptyMap = MapsKt.emptyMap();
        if (mapEmptyMap.isEmpty()) {
            pairArr = new Pair[0];
        } else {
            ArrayList arrayList = new ArrayList(mapEmptyMap.size());
            for (Map.Entry entry : mapEmptyMap.entrySet()) {
                arrayList.add(TuplesKt.m90091to((String) entry.getKey(), entry.getValue()));
            }
            pairArr = (Pair[]) arrayList.toArray(new Pair[0]);
        }
        Bundle bundleBundleOf = BundleKt.bundleOf((Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        SavedStateWriter.m103675constructorimpl(bundleBundleOf);
        SavedStateWriter.m103702putSavedStateimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, bundleBundleOf);
        putClassDiscriminatorIfRequired(this.configuration, descriptor, bundleBundleOf);
        return new SavedStateEncoder(bundleBundleOf, this.configuration);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeBoolean(boolean value) {
        SavedStateWriter.m103681putBooleanimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeByte(byte value) {
        SavedStateWriter.m103692putIntimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeChar(char value) {
        SavedStateWriter.m103683putCharimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeDouble(double value) {
        SavedStateWriter.m103688putDoubleimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    @Override // wg0.AbstractC45828a
    public boolean encodeElement(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        String strMo91527f = descriptor.mo91527f(index);
        this.key = strMo91527f;
        checkDiscriminatorCollisions(this.savedState, strMo91527f);
        return true;
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeEnum(@NotNull InterfaceC45533f enumDescriptor, int index) {
        Intrinsics.checkNotNullParameter(enumDescriptor, "enumDescriptor");
        SavedStateWriter.m103692putIntimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, index);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeFloat(float value) {
        SavedStateWriter.m103690putFloatimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeInt(int value) {
        SavedStateWriter.m103692putIntimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeLong(long value) {
        SavedStateWriter.m103696putLongimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeNull() {
        SavedStateWriter.m103698putNullimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key);
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeShort(short value) {
        SavedStateWriter.m103692putIntimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }

    @NotNull
    /* JADX INFO: renamed from: getKey$savedstate_release, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    @NotNull
    /* JADX INFO: renamed from: getSavedState$savedstate_release, reason: from getter */
    public final Bundle getSavedState() {
        return this.savedState;
    }

    @Override // wg0.InterfaceC45830c
    @NotNull
    public AbstractC46494a getSerializersModule() {
        return this.serializersModule;
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45829b
    public boolean shouldEncodeElementDefault(@NotNull InterfaceC45533f descriptor, int index) {
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        return this.configuration.getEncodeDefaults();
    }

    public SavedStateEncoder(@NotNull Bundle savedState, @NotNull SavedStateConfiguration configuration) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.savedState = savedState;
        this.configuration = configuration;
        this.key = "";
        this.serializersModule = configuration.getSerializersModule();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final <T> boolean encodeFormatSpecificTypes(InterfaceC44963p<? super T> serializer, T value) {
        if (!SavedStateEncoder_androidKt.encodeFormatSpecificTypesOnPlatform(this, serializer, value)) {
            InterfaceC45533f descriptor = serializer.getDescriptor();
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntListDescriptor())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Int>");
                encodeIntList((List) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringListDescriptor())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.collections.List<kotlin.String>");
                encodeStringList((List) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getBooleanArrayDescriptor())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.BooleanArray");
                encodeBooleanArray((boolean[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getCharArrayDescriptor())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.CharArray");
                encodeCharArray((char[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getDoubleArrayDescriptor())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.DoubleArray");
                encodeDoubleArray((double[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getFloatArrayDescriptor())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.FloatArray");
                encodeFloatArray((float[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getIntArrayDescriptor())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.IntArray");
                encodeIntArray((int[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getLongArrayDescriptor())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.LongArray");
                encodeLongArray((long[]) value);
                return true;
            }
            if (Intrinsics.areEqual(descriptor, SavedStateCodecUtilsKt.getStringArrayDescriptor())) {
                Intrinsics.checkNotNull(value, "null cannot be cast to non-null type kotlin.Array<kotlin.String>");
                encodeStringArray((String[]) value);
                return true;
            }
            return false;
        }
        return true;
    }

    private final void putClassDiscriminatorIfRequired(SavedStateConfiguration configuration, InterfaceC45533f descriptor, Bundle savedState) {
        if (configuration.getClassDiscriminatorMode() == 1 && !SavedStateReader.m103590containsimpl(SavedStateReader.m103589constructorimpl(savedState), "type")) {
            if (!Intrinsics.areEqual(descriptor.getKind(), AbstractC45542o.a.f102630a) && !Intrinsics.areEqual(descriptor.getKind(), AbstractC45542o.d.f102633a)) {
                return;
            }
            SavedStateWriter.m103708putStringimpl(SavedStateWriter.m103675constructorimpl(savedState), "type", descriptor.getSerialName());
        }
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public <T> void encodeSerializableValue(@NotNull InterfaceC44963p<? super T> serializer, T value) {
        Intrinsics.checkNotNullParameter(serializer, "serializer");
        if (!encodeFormatSpecificTypes(serializer, value)) {
            super.encodeSerializableValue(serializer, value);
        }
    }

    @Override // wg0.AbstractC45828a, wg0.InterfaceC45830c
    public void encodeString(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        SavedStateWriter.m103708putStringimpl(SavedStateWriter.m103675constructorimpl(this.savedState), this.key, value);
    }
}
