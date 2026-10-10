package com.sumsub.sns.internal.features.data.model.common;

import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import tg0.InterfaceC44951d;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.data.model.common.S0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C29051S0 {
    @NotNull
    public final InterfaceC44951d<AbstractC29103d2> serializer() {
        return C29047R0.f58985a;
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC29103d2 m69736a(String str) {
        FieldName$KnownFieldName next;
        AbstractC29103d2 fieldName;
        Integer intOrNull;
        Integer intOrNull2;
        Iterator<FieldName$KnownFieldName> it = FieldName$KnownFieldName.getEntries().iterator();
        do {
            if (it.hasNext()) {
                next = it.next();
            } else {
                next = null;
                break;
            }
        } while (!Intrinsics.areEqual(next.getFieldName().mo69715b(), str));
        FieldName$KnownFieldName fieldName$KnownFieldName = next;
        if (fieldName$KnownFieldName != null) {
            fieldName = fieldName$KnownFieldName.getFieldName();
        } else {
            fieldName = null;
        }
        if (fieldName != null) {
            return fieldName;
        }
        if (StringsKt.startsWith$default(str, "local_tins_tin_", false, 2, (Object) null) && (intOrNull2 = StringsKt.toIntOrNull(StringsKt.removePrefix(str, (CharSequence) "local_tins_tin_"))) != null) {
            return new C29076Y1(intOrNull2.intValue());
        }
        if (StringsKt.startsWith$default(str, "local_tins_country_", false, 2, (Object) null) && (intOrNull = StringsKt.toIntOrNull(StringsKt.removePrefix(str, (CharSequence) "local_tins_country_"))) != null) {
            return new C29060U1(intOrNull.intValue());
        }
        return new C28977A1(str);
    }
}
