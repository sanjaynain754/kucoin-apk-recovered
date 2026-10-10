package p852kotlin.reflect.jvm.internal.impl.metadata.deserialization;

import com.tencent.bugly.proguard.C33978va;
import java.util.LinkedList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.Triple;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.metadata.ProtoBuf;

/* JADX INFO: compiled from: NameResolverImpl.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class NameResolverImpl implements NameResolver {

    @NotNull
    private final ProtoBuf.QualifiedNameTable qualifiedNames;

    @NotNull
    private final ProtoBuf.StringTable strings;

    /* JADX INFO: compiled from: NameResolverImpl.kt */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.values().length];
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ProtoBuf.QualifiedNameTable.QualifiedName.Kind.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Triple<List<String>, List<String>, Boolean> traverseIds(int i11) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z11 = false;
        while (i11 != -1) {
            ProtoBuf.QualifiedNameTable.QualifiedName qualifiedName = this.qualifiedNames.getQualifiedName(i11);
            String string = this.strings.getString(qualifiedName.getShortName());
            ProtoBuf.QualifiedNameTable.QualifiedName.Kind kind = qualifiedName.getKind();
            Intrinsics.checkNotNull(kind);
            int i12 = WhenMappings.$EnumSwitchMapping$0[kind.ordinal()];
            if (i12 == 1) {
                linkedList2.addFirst(string);
            } else if (i12 == 2) {
                linkedList.addFirst(string);
            } else {
                if (i12 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                linkedList2.addFirst(string);
                z11 = true;
            }
            i11 = qualifiedName.getParentQualifiedName();
        }
        return new Triple<>(linkedList, linkedList2, Boolean.valueOf(z11));
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getString(int i11) {
        String string = this.strings.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    public NameResolverImpl(@NotNull ProtoBuf.StringTable strings, @NotNull ProtoBuf.QualifiedNameTable qualifiedNames) {
        Intrinsics.checkNotNullParameter(strings, "strings");
        Intrinsics.checkNotNullParameter(qualifiedNames, "qualifiedNames");
        this.strings = strings;
        this.qualifiedNames = qualifiedNames;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    @NotNull
    public String getQualifiedClassName(int i11) {
        Triple<List<String>, List<String>, Boolean> tripleTraverseIds = traverseIds(i11);
        List<String> listComponent1 = tripleTraverseIds.component1();
        String strJoinToString$default = CollectionsKt.joinToString$default(tripleTraverseIds.component2(), C33978va.f72339h, null, null, 0, null, null, 62, null);
        if (listComponent1.isEmpty()) {
            return strJoinToString$default;
        }
        return CollectionsKt.joinToString$default(listComponent1, "/", null, null, 0, null, null, 62, null) + '/' + strJoinToString$default;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.metadata.deserialization.NameResolver
    public boolean isLocalClassName(int i11) {
        return traverseIds(i11).getThird().booleanValue();
    }
}
