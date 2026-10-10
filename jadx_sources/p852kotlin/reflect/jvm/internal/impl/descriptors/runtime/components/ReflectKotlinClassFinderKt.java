package p852kotlin.reflect.jvm.internal.impl.descriptors.runtime.components;

import p852kotlin.reflect.jvm.internal.impl.name.ClassId;
import p852kotlin.text.StringsKt;
import p852kotlin.text.Typography;

/* JADX INFO: compiled from: ReflectKotlinClassFinder.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class ReflectKotlinClassFinderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String toRuntimeFqName(ClassId classId) {
        String strReplace$default = StringsKt.replace$default(classId.getRelativeClassName().asString(), '.', Typography.dollar, false, 4, (Object) null);
        if (classId.getPackageFqName().isRoot()) {
            return strReplace$default;
        }
        return classId.getPackageFqName() + '.' + strReplace$default;
    }
}
