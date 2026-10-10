package p852kotlin.reflect.jvm.internal.impl.resolve.constants;

import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.jvm.internal.impl.descriptors.ModuleDescriptor;
import p852kotlin.reflect.jvm.internal.impl.types.SimpleType;

/* JADX INFO: compiled from: constantValues.kt */
/* JADX INFO: loaded from: classes61.dex */
public final class CharValue extends IntegerValueConstant<Character> {
    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public SimpleType getType(@NotNull ModuleDescriptor module) {
        Intrinsics.checkNotNullParameter(module, "module");
        SimpleType charType = module.getBuiltIns().getCharType();
        Intrinsics.checkNotNullExpressionValue(charType, "getCharType(...)");
        return charType;
    }

    public CharValue(char c11) {
        super(Character.valueOf(c11));
    }

    private final String getPrintablePart(char c11) {
        switch (c11) {
            case '\b':
                return "\\b";
            case '\t':
                return "\\t";
            case '\n':
                return "\\n";
            case 11:
            default:
                if (isPrintableUnicode(c11)) {
                    return String.valueOf(c11);
                }
                return "?";
            case '\f':
                return "\\f";
            case '\r':
                return "\\r";
        }
    }

    private final boolean isPrintableUnicode(char c11) {
        byte type = (byte) Character.getType(c11);
        if (type != 0 && type != 13 && type != 14 && type != 15 && type != 16 && type != 18 && type != 19) {
            return true;
        }
        return false;
    }

    @Override // p852kotlin.reflect.jvm.internal.impl.resolve.constants.ConstantValue
    @NotNull
    public String toString() {
        String str = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(getValue().charValue()), getPrintablePart(getValue().charValue())}, 2));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        return str;
    }
}
