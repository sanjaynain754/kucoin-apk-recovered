package kotlinx.serialization.internal;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.InterfaceC41787b;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.reflect.KClass;
import tg0.C44956i;
import tg0.InterfaceC44949c;
import tg0.InterfaceC44951d;
import tg0.InterfaceC44963p;
import vg0.InterfaceC45533f;
import wg0.InterfaceC45829b;
import wg0.InterfaceC45830c;

/* JADX INFO: renamed from: kotlinx.serialization.internal.b */
/* JADX INFO: compiled from: AbstractPolymorphicSerializer.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\t\b\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000e\u001a\u00028\u00002\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0014\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00132\u0006\u0010\r\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u0017\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00162\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00028\u0000H\u0017¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00000\u001c8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, m90084d2 = {"Lkotlinx/serialization/internal/b;", "", ExifInterface.GPS_DIRECTION_TRUE, "Ltg0/d;", "<init>", "()V", "Lwg0/c;", "encoder", "value", "", "serialize", "(Lwg0/c;Ljava/lang/Object;)V", "Lkotlinx/serialization/encoding/b;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/b;)Ljava/lang/Object;", "Lkotlinx/serialization/encoding/CompositeDecoder;", "", "klassName", "Ltg0/c;", "c", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/lang/String;)Ltg0/c;", "Ltg0/p;", "d", "(Lwg0/c;Ljava/lang/Object;)Ltg0/p;", "compositeDecoder", "b", "(Lkotlinx/serialization/encoding/CompositeDecoder;)Ljava/lang/Object;", "Lkotlin/reflect/KClass;", "e", "()Lkotlin/reflect/KClass;", "baseClass", "kotlinx-serialization-core"}, m90085k = 1, m90086mv = {2, 0, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nAbstractPolymorphicSerializer.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n+ 2 Encoding.kt\nkotlinx/serialization/encoding/EncodingKt\n+ 3 Platform.common.kt\nkotlinx/serialization/internal/Platform_commonKt\n+ 4 Decoding.kt\nkotlinx/serialization/encoding/DecodingKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,115:1\n475#2,2:116\n477#2,2:119\n82#3:118\n570#4,2:121\n572#4,2:124\n1#5:123\n*S KotlinDebug\n*F\n+ 1 AbstractPolymorphicSerializer.kt\nkotlinx/serialization/internal/AbstractPolymorphicSerializer\n*L\n33#1:116,2\n33#1:119,2\n35#1:118\n39#1:121,2\n39#1:124,2\n*E\n"})
public abstract class AbstractC41793b<T> implements InterfaceC44951d<T> {
    @NotNull
    /* JADX INFO: renamed from: e */
    public abstract KClass<T> mo91487e();

    @Nullable
    /* JADX INFO: renamed from: c */
    public InterfaceC44949c<T> mo91485c(@NotNull CompositeDecoder decoder, @Nullable String klassName) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.getSerializersModule().mo92031e(mo91487e(), klassName);
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public InterfaceC44963p<T> mo91486d(@NotNull InterfaceC45830c encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.getSerializersModule().mo92032f(mo91487e(), value);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // tg0.InterfaceC44949c
    @NotNull
    public final T deserialize(@NotNull InterfaceC41787b decoder) {
        T t11;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        InterfaceC45533f descriptor = getDescriptor();
        CompositeDecoder compositeDecoderBeginStructure = decoder.beginStructure(descriptor);
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        if (compositeDecoderBeginStructure.decodeSequentially()) {
            t11 = (T) m91484b(compositeDecoderBeginStructure);
        } else {
            Object objM91414c = null;
            while (true) {
                int iDecodeElementIndex = compositeDecoderBeginStructure.decodeElementIndex(getDescriptor());
                if (iDecodeElementIndex == -1) {
                    if (objM91414c != null) {
                        Intrinsics.checkNotNull(objM91414c, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer");
                        t11 = (T) objM91414c;
                        break;
                    }
                    throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) objectRef.element)).toString());
                }
                if (iDecodeElementIndex == 0) {
                    objectRef.element = (T) compositeDecoderBeginStructure.decodeStringElement(getDescriptor(), iDecodeElementIndex);
                } else {
                    if (iDecodeElementIndex != 1) {
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append("Invalid index in polymorphic deserialization of ");
                        String str = (String) objectRef.element;
                        if (str == null) {
                            str = "unknown class";
                        }
                        sb2.append(str);
                        sb2.append("\n Expected 0, 1 or DECODE_DONE(-1), but found ");
                        sb2.append(iDecodeElementIndex);
                        throw new SerializationException(sb2.toString());
                    }
                    T t12 = objectRef.element;
                    if (t12 == 0) {
                        throw new IllegalArgumentException("Cannot read polymorphic value before its type token");
                    }
                    objectRef.element = t12;
                    objM91414c = CompositeDecoder.C41785a.m91414c(compositeDecoderBeginStructure, getDescriptor(), iDecodeElementIndex, C44956i.m99414a(this, compositeDecoderBeginStructure, (String) t12), null, 8, null);
                }
            }
        }
        compositeDecoderBeginStructure.endStructure(descriptor);
        return t11;
    }

    @Override // tg0.InterfaceC44963p
    public final void serialize(@NotNull InterfaceC45830c encoder, @NotNull T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        InterfaceC44963p<? super T> interfaceC44963pM99415b = C44956i.m99415b(this, encoder, value);
        InterfaceC45533f descriptor = getDescriptor();
        InterfaceC45829b interfaceC45829bBeginStructure = encoder.beginStructure(descriptor);
        interfaceC45829bBeginStructure.encodeStringElement(getDescriptor(), 0, interfaceC44963pM99415b.getDescriptor().getSerialName());
        InterfaceC45533f descriptor2 = getDescriptor();
        Intrinsics.checkNotNull(interfaceC44963pM99415b, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        interfaceC45829bBeginStructure.encodeSerializableElement(descriptor2, 1, interfaceC44963pM99415b, value);
        interfaceC45829bBeginStructure.endStructure(descriptor);
    }

    /* JADX INFO: renamed from: b */
    public final T m91484b(CompositeDecoder compositeDecoder) {
        return (T) CompositeDecoder.C41785a.m91414c(compositeDecoder, getDescriptor(), 1, C44956i.m99414a(this, compositeDecoder, compositeDecoder.decodeStringElement(getDescriptor(), 0)), null, 8, null);
    }
}
