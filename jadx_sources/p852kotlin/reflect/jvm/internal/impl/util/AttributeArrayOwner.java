package p852kotlin.reflect.jvm.internal.impl.util;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AttributeArrayOwner.kt */
/* JADX INFO: loaded from: classes61.dex */
@SourceDebugExtension({"SMAP\nAttributeArrayOwner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AttributeArrayOwner.kt\norg/jetbrains/kotlin/util/AttributeArrayOwner\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,103:1\n1573#2:104\n1604#2,3:105\n295#2,2:108\n1607#2:110\n*S KotlinDebug\n*F\n+ 1 AttributeArrayOwner.kt\norg/jetbrains/kotlin/util/AttributeArrayOwner\n*L\n76#1:104\n76#1:105,3\n77#1:108,2\n76#1:110\n*E\n"})
public abstract class AttributeArrayOwner<K, T> extends AbstractArrayMapOwner<K, T> {

    @NotNull
    private ArrayMap<T> arrayMap;

    public AttributeArrayOwner(@NotNull ArrayMap<T> arrayMap) {
        Intrinsics.checkNotNullParameter(arrayMap, "arrayMap");
        this.arrayMap = arrayMap;
    }

    private final String buildDiagnosticMessage(ArrayMap<T> arrayMap, int i11, String str) {
        T next;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Race condition happened, the size of ArrayMap is " + i11 + " but it isn't an `" + str + '`');
        sb2.append('\n');
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Type: ");
        sb3.append(arrayMap.getClass());
        sb2.append(sb3.toString());
        sb2.append('\n');
        StringBuilder sb4 = new StringBuilder();
        Map<String, Integer> mapAllValuesThreadUnsafeForRendering = getTypeRegistry().allValuesThreadUnsafeForRendering();
        sb4.append("[");
        sb4.append('\n');
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayMap, 10));
        int i12 = 0;
        for (T t11 : arrayMap) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            Iterator<T> it = mapAllValuesThreadUnsafeForRendering.entrySet().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((Number) ((Map.Entry) next).getValue()).intValue() != i12);
            sb4.append("  " + ((Map.Entry) next) + '[' + i12 + "]: " + t11);
            sb4.append('\n');
            arrayList.add(sb4);
            i12 = i13;
        }
        sb4.append("]");
        sb4.append('\n');
        sb2.append("Content: " + sb4.toString());
        sb2.append('\n');
        return sb2.toString();
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    @NotNull
    public final ArrayMap<T> getArrayMap() {
        return this.arrayMap;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p852kotlin.reflect.jvm.internal.impl.util.AbstractArrayMapOwner
    public final void registerComponent(@NotNull String keyQualifiedName, @NotNull T value) {
        Intrinsics.checkNotNullParameter(keyQualifiedName, "keyQualifiedName");
        Intrinsics.checkNotNullParameter(value, "value");
        int id2 = getTypeRegistry().getId(keyQualifiedName);
        int size = this.arrayMap.getSize();
        if (size == 0) {
            ArrayMap<T> arrayMap = this.arrayMap;
            if (!(arrayMap instanceof EmptyArrayMap)) {
                throw new IllegalStateException(buildDiagnosticMessage(arrayMap, 0, "EmptyArrayMap"));
            }
            this.arrayMap = new OneElementArrayMap(value, id2);
            return;
        }
        if (size == 1) {
            ArrayMap<T> arrayMap2 = this.arrayMap;
            try {
                Intrinsics.checkNotNull(arrayMap2, "null cannot be cast to non-null type org.jetbrains.kotlin.util.OneElementArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
                OneElementArrayMap oneElementArrayMap = (OneElementArrayMap) arrayMap2;
                if (oneElementArrayMap.getIndex() == id2) {
                    this.arrayMap = new OneElementArrayMap(value, id2);
                    return;
                } else {
                    ArrayMapImpl arrayMapImpl = new ArrayMapImpl();
                    arrayMapImpl.set(oneElementArrayMap.getIndex(), oneElementArrayMap.getValue());
                    this.arrayMap = arrayMapImpl;
                }
            } catch (ClassCastException e11) {
                throw new IllegalStateException(buildDiagnosticMessage(arrayMap2, 1, "OneElementArrayMap"), e11);
            }
        }
        this.arrayMap.set(id2, value);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AttributeArrayOwner() {
        EmptyArrayMap emptyArrayMap = EmptyArrayMap.INSTANCE;
        Intrinsics.checkNotNull(emptyArrayMap, "null cannot be cast to non-null type org.jetbrains.kotlin.util.ArrayMap<T of org.jetbrains.kotlin.util.AttributeArrayOwner>");
        this(emptyArrayMap);
    }
}
