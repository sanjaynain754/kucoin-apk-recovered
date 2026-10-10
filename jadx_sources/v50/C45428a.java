package v50;

import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.jvm.internal.ArrayIteratorKt;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: v50.a */
/* JADX INFO: compiled from: Converter.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"bind", "", "any", "TradingBotKitLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class C45428a {

    /* JADX INFO: renamed from: v50.a$a */
    /* JADX INFO: compiled from: Converter.kt */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0005\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/tradingbotkit/util/ConverterKt$bind$1", "Lcom/google/gson/reflect/TypeToken;", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class a extends TypeToken<Byte> {
    }

    /* JADX INFO: renamed from: v50.a$b */
    /* JADX INFO: compiled from: Converter.kt */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\n\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/tradingbotkit/util/ConverterKt$bind$2", "Lcom/google/gson/reflect/TypeToken;", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class b extends TypeToken<Short> {
    }

    /* JADX INFO: renamed from: v50.a$c */
    /* JADX INFO: compiled from: Converter.kt */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/tradingbotkit/util/ConverterKt$bind$3", "Lcom/google/gson/reflect/TypeToken;", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class c extends TypeToken<Integer> {
    }

    /* JADX INFO: renamed from: v50.a$d */
    /* JADX INFO: compiled from: Converter.kt */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/tradingbotkit/util/ConverterKt$bind$4", "Lcom/google/gson/reflect/TypeToken;", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class d extends TypeToken<Double> {
    }

    /* JADX INFO: renamed from: v50.a$e */
    /* JADX INFO: compiled from: Converter.kt */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/tradingbotkit/util/ConverterKt$bind$5", "Lcom/google/gson/reflect/TypeToken;", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class e extends TypeToken<Float> {
    }

    /* JADX INFO: renamed from: v50.a$f */
    /* JADX INFO: compiled from: Converter.kt */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/tradingbotkit/util/ConverterKt$bind$6", "Lcom/google/gson/reflect/TypeToken;", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class f extends TypeToken<Long> {
    }

    /* JADX INFO: renamed from: v50.a$g */
    /* JADX INFO: compiled from: Converter.kt */
    @Metadata(m90083d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m90084d2 = {"com/kubi/tradingbotkit/util/ConverterKt$bind$7", "Lcom/google/gson/reflect/TypeToken;", "", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class g extends TypeToken<Boolean> {
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final Object m100399a(@NotNull Object obj, @NotNull Object any) throws IllegalAccessException {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        Intrinsics.checkNotNullParameter(any, "any");
        Iterator it = ArrayIteratorKt.iterator(any.getClass().getDeclaredFields());
        while (it.hasNext()) {
            Field field = (Field) it.next();
            if ((field.getModifiers() & 8) == 0) {
                try {
                    Field declaredField = obj.getClass().getDeclaredField(field.getName());
                    if (Intrinsics.areEqual(field.getType(), declaredField.getType())) {
                        field.setAccessible(true);
                        declaredField.setAccessible(true);
                        Object obj2 = field.get(any);
                        if (obj2 != null) {
                            if (ArraysKt.contains((Class<?>[]) new Class[]{Byte.TYPE, Short.TYPE, Integer.TYPE, Double.TYPE, Float.TYPE, Long.TYPE, Boolean.TYPE, new a().getRawType(), new b().getRawType(), new c().getRawType(), new d().getRawType(), new e().getRawType(), new f().getRawType(), new g().getRawType()}, field.getType()) || field.getType().isAssignableFrom(String.class) || field.getType().isAssignableFrom(BigDecimal.class)) {
                                declaredField.set(obj, obj2);
                            } else {
                                Object obj3 = declaredField.get(obj);
                                if (obj3 != null) {
                                    m100399a(obj3, obj2);
                                }
                            }
                        }
                    }
                } catch (Throwable unused) {
                }
            }
        }
        return obj;
    }
}
