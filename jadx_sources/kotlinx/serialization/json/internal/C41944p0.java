package kotlinx.serialization.json.internal;

import cn.jiguang.privates.push.constants.JPushConstants;
import com.tencent.bugly.proguard.C33612dh;
import java.lang.annotation.Annotation;
import kotlinx.serialization.internal.C41895w0;
import kotlinx.serialization.json.ClassDiscriminatorMode;
import kotlinx.serialization.json.JsonElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Reflection;
import p852kotlin.jvm.internal.SourceDebugExtension;
import tg0.C44960m;
import tg0.InterfaceC44963p;
import vg0.AbstractC45531d;
import vg0.AbstractC45532e;
import vg0.AbstractC45541n;
import vg0.InterfaceC45533f;
import xg0.AbstractC46162a;
import xg0.InterfaceC46170e;

/* JADX INFO: renamed from: kotlinx.serialization.json.internal.p0 */
/* JADX INFO: compiled from: Polymorphic.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\u001a/\u0010\u0006\u001a\u00020\u00052\n\u0010\u0001\u001a\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a!\u0010\u0015\u001a\u00020\u00142\b\u0010\u0011\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m90084d2 = {"Ltg0/p;", "serializer", "actualSerializer", "", "classDiscriminator", "", "e", "(Ltg0/p;Ltg0/p;Ljava/lang/String;)V", "Lvg0/n;", C33612dh.f69618m, "b", "(Lvg0/n;)V", "Lvg0/f;", "Lxg0/a;", JPushConstants.Analysis.KEY_JSON, "c", "(Lvg0/f;Lxg0/a;)Ljava/lang/String;", "serialName", "Lkotlinx/serialization/json/JsonElement;", "element", "", "d", "(Ljava/lang/String;Lkotlinx/serialization/json/JsonElement;)Ljava/lang/Void;", "kotlinx-serialization-json"}, m90085k = 2, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPolymorphic.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 TreeJsonEncoder.kt\nkotlinx/serialization/json/internal/TreeJsonEncoderKt\n*L\n1#1,107:1\n1#2:108\n271#3,8:109\n*S KotlinDebug\n*F\n+ 1 Polymorphic.kt\nkotlinx/serialization/json/internal/PolymorphicKt\n*L\n81#1:109,8\n*E\n"})
public final class C41944p0 {

    /* JADX INFO: renamed from: kotlinx.serialization.json.internal.p0$a */
    /* JADX INFO: compiled from: Polymorphic.kt */
    @Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 176)
    public /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ClassDiscriminatorMode.values().length];
            try {
                iArr[ClassDiscriminatorMode.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ClassDiscriminatorMode.POLYMORPHIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ClassDiscriminatorMode.ALL_JSON_OBJECTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m91983b(@NotNull AbstractC45541n kind) {
        Intrinsics.checkNotNullParameter(kind, "kind");
        if (kind instanceof AbstractC45541n.b) {
            throw new IllegalStateException("Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof AbstractC45532e) {
            throw new IllegalStateException("Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead");
        }
        if (kind instanceof AbstractC45531d) {
            throw new IllegalStateException("Actual serializer for polymorphic cannot be polymorphic itself");
        }
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final String m91984c(@NotNull InterfaceC45533f interfaceC45533f, @NotNull AbstractC46162a json) {
        Intrinsics.checkNotNullParameter(interfaceC45533f, "<this>");
        Intrinsics.checkNotNullParameter(json, "json");
        for (Annotation annotation : interfaceC45533f.getAnnotations()) {
            if (annotation instanceof InterfaceC46170e) {
                return ((InterfaceC46170e) annotation).discriminator();
            }
        }
        return json.getConfiguration().getClassDiscriminator();
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final Void m91985d(@Nullable String str, @NotNull JsonElement element) {
        Intrinsics.checkNotNullParameter(element, "element");
        throw new JsonEncodingException("Class with serial name " + str + " cannot be serialized polymorphically because it is represented as " + Reflection.getOrCreateKotlinClass(element.getClass()).getSimpleName() + ". Make sure that its JsonTransformingSerializer returns JsonObject, so class discriminator can be added to it.");
    }

    /* JADX INFO: renamed from: e */
    public static final void m91986e(InterfaceC44963p<?> interfaceC44963p, InterfaceC44963p<?> interfaceC44963p2, String str) {
        if ((interfaceC44963p instanceof C44960m) && C41895w0.m91741a(interfaceC44963p2.getDescriptor()).contains(str)) {
            String serialName = ((C44960m) interfaceC44963p).getDescriptor().getSerialName();
            throw new IllegalStateException(("Sealed class '" + interfaceC44963p2.getDescriptor().getSerialName() + "' cannot be serialized as base class '" + serialName + "' because it has property name that conflicts with JSON class discriminator '" + str + "'. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism").toString());
        }
    }
}
