package p852kotlin.reflect.jvm.internal;

import com.tencent.qcloud.tuicore.TUIConstants;
import java.lang.reflect.Method;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.ReflectClassUtilKt;

/* JADX INFO: compiled from: RuntimeTypeMapper.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m90084d2 = {TUIConstants.TUICalling.PARAM_NAME_AUDIO_SIGNATURE, "", "Ljava/lang/reflect/Method;", "getSignature", "(Ljava/lang/reflect/Method;)Ljava/lang/String;", "kotlin-reflection"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class RuntimeTypeMapperKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getSignature(Method method) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(method.getName());
        Class<?>[] parameterTypes = method.getParameterTypes();
        Intrinsics.checkNotNullExpressionValue(parameterTypes, "getParameterTypes(...)");
        sb2.append(ArraysKt.joinToString$default(parameterTypes, "", "(", ")", 0, (CharSequence) null, new Function1() { // from class: kotlin.reflect.jvm.internal.RuntimeTypeMapperKt$$Lambda$0
            @Override // p852kotlin.jvm.functions.Function1
            public Object invoke(Object obj) {
                return RuntimeTypeMapperKt._get_signature_$lambda$0((Class) obj);
            }
        }, 24, (Object) null));
        Class<?> returnType = method.getReturnType();
        Intrinsics.checkNotNullExpressionValue(returnType, "getReturnType(...)");
        sb2.append(ReflectClassUtilKt.getDesc(returnType));
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence _get_signature_$lambda$0(Class cls) {
        Intrinsics.checkNotNull(cls);
        return ReflectClassUtilKt.getDesc(cls);
    }
}
