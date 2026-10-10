package com.sumsub.sns.internal.core.presentation.helper.camera;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.presentation.intro.C28895g;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29180q2;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.IdentitySide;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import java.util.Arrays;
import java.util.List;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.StringCompanionObject;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.presentation.helper.camera.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC28881b {
    /* JADX INFO: renamed from: a */
    public static final CharSequence m69666a(C29983l c29983l, AbstractC29180q2 abstractC29180q2) {
        return abstractC29180q2.m69801a(c29983l, null);
    }

    /* JADX INFO: renamed from: b */
    public static final CharSequence m69667b(C29983l c29983l, AbstractC29180q2 abstractC29180q2) {
        return abstractC29180q2.m69801a(c29983l, null);
    }

    /* JADX INFO: renamed from: a */
    public static AbstractC28885f m69665a(final C29983l c29983l, C29070X c29070x, C29154m c29154m, C28895g c28895g, List list, IdentitySide identitySide) {
        String value;
        if (!c29070x.m69749f()) {
            AbstractC29180q2 abstractC29180q2 = list.size() == 1 ? (AbstractC29180q2) CollectionsKt.first(list) : null;
            if (identitySide != null && (value = identitySide.getValue()) != null) {
                C29903a c29903a = C28366e.f57832a;
                C28366e.f57834c.put(GlobalStatePayload.IdDocSubType, value);
            }
            int i11 = identitySide == null ? -1 : AbstractC28880a.f58724a[identitySide.ordinal()];
            if (i11 != 1) {
                if (i11 != 2) {
                    return C28884e.f58731a;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                return new C28882c(c29983l.m70062a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "backSide", "title", abstractC29180q2 != null ? abstractC29180q2.f59176a : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "backSide", "title"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME, "scan", "backSide", "title"}, 4))), c29983l.m70062a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "backSide", "brief", abstractC29180q2 != null ? abstractC29180q2.f59176a : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "backSide", "brief"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME, "scan", "backSide", "brief"}, 4))), c29983l.m70062a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "backSide", "details", abstractC29180q2 != null ? abstractC29180q2.f59176a : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "backSide", "details"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME, "scan", "backSide", "details"}, 4))), c28895g);
            }
            String strM70061a = c29983l.m70061a("sns_iddoc_listing_join");
            String strJoinToString$default = CollectionsKt.joinToString$default(list, strM70061a == null ? "" : strM70061a, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.helper.camera.g
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC28881b.m69666a(c29983l, (AbstractC29180q2) obj);
                }
            }, 30, null);
            String strM70061a2 = c29983l.m70061a("sns_iddoc_listing_join_details");
            String strJoinToString$default2 = CollectionsKt.joinToString$default(list, strM70061a2 == null ? "" : strM70061a2, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.core.presentation.helper.camera.h
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AbstractC28881b.m69667b(c29983l, (AbstractC29180q2) obj);
                }
            }, 30, null);
            StringCompanionObject stringCompanionObject2 = StringCompanionObject.INSTANCE;
            return new C28882c(c29983l.m70062a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "frontSide", "title", abstractC29180q2 != null ? abstractC29180q2.f59176a : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "frontSide", "title"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME, "scan", "frontSide", "title"}, 4))), String.format(StringsKt.replace$default(c29983l.m70062a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "frontSide", "brief", abstractC29180q2 != null ? abstractC29180q2.f59176a : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "frontSide", "brief"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME, "scan", "frontSide", "brief"}, 4))), "{doctypes}", "%s", false, 4, (Object) null), Arrays.copyOf(new Object[]{strJoinToString$default}, 1)), String.format(StringsKt.replace$default(c29983l.m70062a(String.format("sns_step_%s_%s_%s_%s::%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "frontSide", "details", abstractC29180q2 != null ? abstractC29180q2.f59176a : null}, 5)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{c29070x.f59014a, "scan", "frontSide", "details"}, 4)), String.format("sns_step_%s_%s_%s_%s", Arrays.copyOf(new Object[]{RemoteConfigComponent.DEFAULTS_FILE_NAME, "scan", "frontSide", "details"}, 4))), "{doctypes}", "%s", false, 4, (Object) null), Arrays.copyOf(new Object[]{strJoinToString$default2}, 1)), c28895g);
        }
        String str = (c29154m == null || !c29154m.m69791e()) ? "photo" : "portrait";
        String strM70061a3 = c29983l.m70061a("sns_step_" + c29070x.f59014a + "_" + str + "_title");
        if (strM70061a3 == null) {
            strM70061a3 = "";
        }
        String strM70061a4 = c29983l.m70061a("sns_step_" + c29070x.f59014a + "_" + str + "_brief");
        if (strM70061a4 == null) {
            strM70061a4 = "";
        }
        String strM70061a5 = c29983l.m70061a("sns_step_" + c29070x.f59014a + "_" + str + "_details");
        return new C28882c(strM70061a3, strM70061a4, strM70061a5 != null ? strM70061a5 : "", c28895g);
    }
}
