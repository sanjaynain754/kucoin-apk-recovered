package com.sumsub.sns.internal.features.domain;

import com.sumsub.log.logger.Logger;
import com.sumsub.sns.core.data.listener.SNSIconHandler;
import com.sumsub.sns.core.data.model.FlowActionType;
import com.sumsub.sns.core.data.model.FlowType;
import com.sumsub.sns.core.data.model.SNSApplicantNotFoundException;
import com.sumsub.sns.core.data.model.SNSInvalidParametersException;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.data.model.SNSSupportItem;
import com.sumsub.sns.internal.core.analytics.C28366e;
import com.sumsub.sns.internal.core.analytics.GlobalStatePayload;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.domain.C28578h;
import com.sumsub.sns.internal.core.domain.base.AbstractC28542b;
import com.sumsub.sns.internal.core.domain.base.AbstractC28543c;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29722y2;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29074Y;
import com.sumsub.sns.internal.features.data.model.common.C29078Z;
import com.sumsub.sns.internal.features.data.model.common.C29118g;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29136j;
import com.sumsub.sns.internal.features.data.model.common.C29154m;
import com.sumsub.sns.internal.features.data.model.common.LogParams;
import com.sumsub.sns.internal.features.data.model.common.LogType;
import com.sumsub.sns.internal.features.data.repository.analytics.C29903a;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.log.C30002b;
import com.sumsub.sns.internal.features.data.repository.settings.C30034c;
import com.sumsub.sns.internal.log.C33272c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.IntIterator;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.Ref;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.domain.O */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C30081O extends AbstractC28542b {

    /* JADX INFO: renamed from: b */
    public final C30034c f60452b;

    /* JADX INFO: renamed from: c */
    public final C30002b f60453c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC29984m f60454d;

    /* JADX INFO: renamed from: a */
    public static final CharSequence m70104a(C29070X c29070x) {
        return c29070x.f59014a;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C30081O(C28578h c28578h) {
        InterfaceC29953a interfaceC29953a = (InterfaceC29953a) c28578h.f58168f.getValue();
        C30034c c30034c = (C30034c) c28578h.f58167e.getValue();
        C30002b c30002b = (C30002b) c28578h.f58175m.getValue();
        InterfaceC29984m interfaceC29984m = (InterfaceC29984m) c28578h.f58180r.getValue();
        super(interfaceC29953a);
        this.f60452b = c30034c;
        this.f60453c = c30002b;
        this.f60454d = interfaceC29984m;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0246 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:103:0x025d A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:104:0x0260  */
    /* JADX WARN: Code duplicated, block: B:106:0x0263 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:109:0x0276 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:111:0x0284  */
    /* JADX WARN: Code duplicated, block: B:114:0x0289  */
    /* JADX WARN: Code duplicated, block: B:115:0x028a A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:117:0x0290  */
    /* JADX WARN: Code duplicated, block: B:120:0x0295 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:126:0x02a6 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, LOOP:0: B:99:0x0240->B:126:0x02a6, LOOP_END, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:129:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:131:0x02be  */
    /* JADX WARN: Code duplicated, block: B:134:0x02c3 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:138:0x02ed A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:141:0x0319 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x0368 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:157:0x02a9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:158:0x02be A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:159:0x02a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:161:0x029b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x0270 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:168:0x0137 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x0054 A[PHI: r0 r6 r8 r23
      0x0054: PHI (r0v41 java.lang.Object) = (r0v40 java.lang.Object), (r0v1 java.lang.Object) binds: [B:89:0x01ec, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r6v17 com.sumsub.sns.internal.features.data.model.common.p) = 
      (r6v14 com.sumsub.sns.internal.features.data.model.common.p)
      (r6v20 com.sumsub.sns.internal.features.data.model.common.p)
     binds: [B:89:0x01ec, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r8v14 com.sumsub.sns.internal.features.data.model.common.h) = 
      (r8v11 com.sumsub.sns.internal.features.data.model.common.h)
      (r8v16 com.sumsub.sns.internal.features.data.model.common.h)
     binds: [B:89:0x01ec, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE]
      0x0054: PHI (r23v3 int) = (r23v1 int), (r23v4 int) binds: [B:89:0x01ec, B:22:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x009b A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:46:0x00b7 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x00bd A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:55:0x00ce A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x00fc A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x0106 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0115 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0121 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x013d A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:74:0x014b  */
    /* JADX WARN: Code duplicated, block: B:75:0x014c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code duplicated, block: B:80:0x0159 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x016a  */
    /* JADX WARN: Code duplicated, block: B:83:0x016c  */
    /* JADX WARN: Code duplicated, block: B:86:0x01da  */
    /* JADX WARN: Code duplicated, block: B:87:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:93:0x01fb A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:95:0x020e  */
    /* JADX WARN: Code duplicated, block: B:98:0x0214 A[Catch: Exception -> 0x0045, SNSApplicantNotFoundException -> 0x0048, TryCatch #2 {SNSApplicantNotFoundException -> 0x0048, Exception -> 0x0045, blocks: (B:14:0x003e, B:96:0x0210, B:98:0x0214, B:99:0x0240, B:101:0x0246, B:103:0x025d, B:106:0x0263, B:107:0x0270, B:109:0x0276, B:112:0x0285, B:122:0x029b, B:115:0x028a, B:120:0x0295, B:123:0x029f, B:126:0x02a6, B:127:0x02a9, B:130:0x02ba, B:132:0x02bf, B:134:0x02c3, B:137:0x02ca, B:139:0x0311, B:141:0x0319, B:142:0x031c, B:138:0x02ed, B:21:0x004f, B:91:0x01f0, B:93:0x01fb, B:25:0x005c, B:88:0x01dd, B:28:0x006b, B:84:0x0171, B:31:0x0077, B:44:0x00ae, B:46:0x00b7, B:48:0x00bd, B:50:0x00c1, B:52:0x00c7, B:55:0x00ce, B:56:0x00ed, B:57:0x00ee, B:59:0x00f4, B:61:0x00fc, B:63:0x010f, B:65:0x0115, B:67:0x0119, B:69:0x0128, B:70:0x0137, B:72:0x013d, B:77:0x014f, B:78:0x0153, B:80:0x0159, B:68:0x0121, B:62:0x0106, B:32:0x007c, B:38:0x0091, B:40:0x009b, B:144:0x0368, B:145:0x036e, B:35:0x0083), top: B:156:0x0026 }] */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x03a1, code lost:
    
        if (r0 == r5) goto L153;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:55:0x00ce, please report this as an issue */
    /* JADX WARN: Type inference failed for: r0v51, types: [T, java.util.Map] */
    /* JADX WARN: Type inference failed for: r10v30, types: [T, java.util.Map] */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m70105a(ContinuationImpl continuationImpl) {
        C30080N c30080n;
        C29124h c29124h;
        Object objM70043a;
        C29124h c29124h2;
        AbstractC29172p abstractC29172p;
        String str;
        C29136j c29136jMo69755f;
        ArrayList arrayList;
        Iterator it;
        C29124h c29124h3;
        List list;
        C29070X c29070x;
        String str2;
        C29118g c29118g;
        String value;
        FlowActionType flowActionType;
        C30002b c30002b;
        LogType logType;
        LogParams logParams;
        C29124h c29124h4;
        int i11;
        C29124h c29124h5;
        AbstractC29172p abstractC29172p2;
        C29983l c29983l;
        ?? r11;
        String str3;
        SNSSupportItem sNSSupportItem;
        List listListOf;
        Function1 function1;
        List listSplit$default;
        Ref.ObjectRef objectRef;
        Iterator<Integer> it2;
        Object obj;
        Object obj2;
        Map map;
        ArrayList arrayList2;
        ?? map2;
        Object key;
        String str4;
        Object value2;
        Pair pairM90091to;
        if (continuationImpl instanceof C30080N) {
            c30080n = (C30080N) continuationImpl;
            int i12 = c30080n.f60451f;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                c30080n.f60451f = i12 - Integer.MIN_VALUE;
            } else {
                c30080n = new C30080N(this, continuationImpl);
            }
        } else {
            c30080n = new C30080N(this, continuationImpl);
        }
        Object objM69413a = c30080n.f60449d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (c30080n.f60451f) {
                case 0:
                    ResultKt.throwOnFailure(objM69413a);
                    InterfaceC29984m interfaceC29984m = this.f60454d;
                    c30080n.f60451f = 1;
                    objM69413a = ((C29967J) interfaceC29984m).m70047c(true, c30080n);
                    if (objM69413a != coroutine_suspended) {
                        c29124h = (C29124h) objM69413a;
                        if (c29124h.f59068a.length() != 0) {
                            throw new SNSApplicantNotFoundException(null, 1, null);
                        }
                        InterfaceC29984m interfaceC29984m2 = this.f60454d;
                        c30080n.f60446a = c29124h;
                        c30080n.f60451f = 2;
                        objM70043a = ((C29967J) interfaceC29984m2).m70043a(true, (ContinuationImpl) c30080n);
                        if (objM70043a == coroutine_suspended) {
                            c29124h2 = c29124h;
                            objM69413a = objM70043a;
                            abstractC29172p = (AbstractC29172p) objM69413a;
                            if (AbstractC29130i.m69785k(c29124h2)) {
                                c29118g = c29124h2.f59091x;
                                if (c29118g != null || (flowActionType = c29118g.f59063b) == null) {
                                    value = null;
                                } else {
                                    value = flowActionType.getValue();
                                }
                                if (Intrinsics.areEqual(value, FlowActionType.DEPRECATED_FACE_ENROLLMENT_FLOW_ACTION_TYPE)) {
                                    throw new SNSInvalidParametersException(CollectionsKt.listOf("\"" + FlowActionType.DEPRECATED_FACE_ENROLLMENT_FLOW_ACTION_TYPE + "\" action type is deprecated"));
                                }
                            }
                            if (!AbstractC29130i.m69785k(c29124h2)) {
                                str = abstractC29172p.mo69762m().f59171h;
                                if (str != null) {
                                    C29903a c29903a = C28366e.f57832a;
                                    C28366e.f57834c.put(GlobalStatePayload.LevelName, str);
                                } else {
                                    C29903a c29903a2 = C28366e.f57832a;
                                    C28366e.f57834c.remove(GlobalStatePayload.LevelName);
                                }
                                c29136jMo69755f = abstractC29172p.mo69755f();
                                if (c29136jMo69755f != null || (str2 = c29136jMo69755f.f59101a) == null) {
                                    C28366e.f57834c.remove(GlobalStatePayload.Country);
                                } else {
                                    C28366e.f57834c.put(GlobalStatePayload.Country, str2);
                                }
                                List list2 = abstractC29172p.mo69760k().f59151a;
                                arrayList = new ArrayList();
                                it = list2.iterator();
                                while (it.hasNext()) {
                                    c29070x = ((C29154m) it.next()).f59132a;
                                    if (c29070x.m69750g()) {
                                        c29070x = null;
                                    }
                                    if (c29070x != null) {
                                        arrayList.add(c29070x);
                                    }
                                }
                                if (!arrayList.isEmpty()) {
                                    C30034c c30034c = this.f60452b;
                                    c30080n.f60446a = c29124h2;
                                    c30080n.f60447b = abstractC29172p;
                                    c30080n.f60448c = arrayList;
                                    c30080n.f60451f = 3;
                                    objM69413a = c30034c.m70075b(c30080n);
                                    if (objM69413a != coroutine_suspended) {
                                        c29124h3 = c29124h2;
                                        list = arrayList;
                                        c30002b = this.f60453c;
                                        logType = LogType.Warn;
                                        c29124h4 = c29124h3;
                                        i11 = 0;
                                        logParams = new LogParams((String) null, "", (String) null, "PrepareSDKUseCase.kt", (String) objM69413a, "Unknown idDocSetType type: " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.domain.y0
                                            @Override // p852kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj3) {
                                                return C30081O.m70104a((C29070X) obj3);
                                            }
                                        }, 31, null), (String) null, "", 65, (DefaultConstructorMarker) null);
                                        c30080n.f60446a = c29124h4;
                                        c30080n.f60447b = abstractC29172p;
                                        c30080n.f60448c = null;
                                        c30080n.f60451f = 4;
                                        if (c30002b.f60286a.m70064a(logType.getValue(), AbstractC29722y2.m69913a(logParams), c30080n) == coroutine_suspended) {
                                            c29124h2 = c29124h4;
                                            InterfaceC29984m interfaceC29984m3 = this.f60454d;
                                            c30080n.f60446a = c29124h2;
                                            c30080n.f60447b = abstractC29172p;
                                            c30080n.f60451f = 5;
                                            objM69413a = ((C29967J) interfaceC29984m3).m70044b(c30080n);
                                            if (objM69413a == coroutine_suspended) {
                                                c29124h5 = c29124h2;
                                                abstractC29172p2 = abstractC29172p;
                                                c29983l = (C29983l) objM69413a;
                                                if (C28468k0.f57983a.getSupportItems() == null) {
                                                    InterfaceC29953a interfaceC29953a = this.f58096a;
                                                    c30080n.f60446a = c29124h5;
                                                    c30080n.f60447b = abstractC29172p2;
                                                    c30080n.f60448c = c29983l;
                                                    c30080n.f60451f = 6;
                                                    objM69413a = ((C29957e) interfaceC29953a).m70035a(c30080n);
                                                    if (objM69413a == coroutine_suspended) {
                                                    }
                                                    r11 = (Map) objM69413a;
                                                    if (r11 != 0) {
                                                        char[] cArr = new char[1];
                                                        cArr[i11] = (char) 47;
                                                        listSplit$default = StringsKt.split$default((CharSequence) "supportEmail", cArr, false, 0, 6, (Object) null);
                                                        objectRef = new Ref.ObjectRef();
                                                        objectRef.element = r11;
                                                        it2 = RangesKt.until(i11, listSplit$default.size() - 1).iterator();
                                                        while (true) {
                                                            if (it2.hasNext()) {
                                                                obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it2).nextInt()));
                                                                if (obj2 instanceof Map) {
                                                                    map = (Map) obj2;
                                                                } else {
                                                                    map = null;
                                                                }
                                                                if (map != null) {
                                                                    arrayList2 = new ArrayList();
                                                                    for (Map.Entry entry : map.entrySet()) {
                                                                        key = entry.getKey();
                                                                        if (!(key instanceof String)) {
                                                                            key = null;
                                                                        }
                                                                        str4 = (String) key;
                                                                        if (str4 != null) {
                                                                            value2 = entry.getValue();
                                                                            if (value2 == null) {
                                                                                value2 = null;
                                                                            }
                                                                            if (value2 == null) {
                                                                                pairM90091to = TuplesKt.m90091to(str4, value2);
                                                                            }
                                                                            if (pairM90091to != null) {
                                                                                arrayList2.add(pairM90091to);
                                                                            }
                                                                        }
                                                                        pairM90091to = null;
                                                                        if (pairM90091to != null) {
                                                                            arrayList2.add(pairM90091to);
                                                                        }
                                                                    }
                                                                    map2 = MapsKt.toMap(arrayList2);
                                                                    if (map2 == 0) {
                                                                        objectRef.element = map2;
                                                                    }
                                                                }
                                                                str3 = null;
                                                            } else {
                                                                obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                                                if (!(obj instanceof String)) {
                                                                    obj = null;
                                                                }
                                                                str3 = (String) obj;
                                                            }
                                                        }
                                                    } else {
                                                        str3 = null;
                                                    }
                                                    C28468k0 c28468k0 = C28468k0.f57983a;
                                                    if (str3 != null || StringsKt.isBlank(str3)) {
                                                        sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                                    } else {
                                                        sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_EMAIL_title"), c29983l.m70061a("sns_support_EMAIL_description"), SNSSupportItem.Type.Email, str3, null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                                    }
                                                    listListOf = CollectionsKt.listOf(sNSSupportItem);
                                                    function1 = C28468k0.f58003u;
                                                    if (function1 != null) {
                                                        function1.invoke(listListOf);
                                                    }
                                                }
                                                Logger.DefaultImpls.v$default(C33272c.f67812a, "PrepareSDKUseCase", "SDK got the following data: Config is " + c29124h5 + ", Flow type is " + c29124h5.f59069b, null, 4, null);
                                                FlowType flowType = c29124h5.f59069b;
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append("SDK got the config for flow type ");
                                                sb2.append(flowType);
                                                C33272c.f67816e.f67810a.mo68955d("PrepareSDKUseCase", sb2.toString(), null);
                                                return new C29078Z(new C30079M(c29124h5, abstractC29172p2, c29983l));
                                            }
                                        }
                                    }
                                }
                            }
                            i11 = 0;
                            InterfaceC29984m interfaceC29984m4 = this.f60454d;
                            c30080n.f60446a = c29124h2;
                            c30080n.f60447b = abstractC29172p;
                            c30080n.f60451f = 5;
                            objM69413a = ((C29967J) interfaceC29984m4).m70044b(c30080n);
                            if (objM69413a == coroutine_suspended) {
                                c29124h5 = c29124h2;
                                abstractC29172p2 = abstractC29172p;
                                c29983l = (C29983l) objM69413a;
                                if (C28468k0.f57983a.getSupportItems() == null) {
                                    InterfaceC29953a interfaceC29953a2 = this.f58096a;
                                    c30080n.f60446a = c29124h5;
                                    c30080n.f60447b = abstractC29172p2;
                                    c30080n.f60448c = c29983l;
                                    c30080n.f60451f = 6;
                                    objM69413a = ((C29957e) interfaceC29953a2).m70035a(c30080n);
                                    if (objM69413a == coroutine_suspended) {
                                    }
                                    r11 = (Map) objM69413a;
                                    if (r11 != 0) {
                                        char[] cArr2 = new char[1];
                                        cArr2[i11] = (char) 47;
                                        listSplit$default = StringsKt.split$default((CharSequence) "supportEmail", cArr2, false, 0, 6, (Object) null);
                                        objectRef = new Ref.ObjectRef();
                                        objectRef.element = r11;
                                        it2 = RangesKt.until(i11, listSplit$default.size() - 1).iterator();
                                        while (true) {
                                            if (it2.hasNext()) {
                                                obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it2).nextInt()));
                                                if (obj2 instanceof Map) {
                                                    map = (Map) obj2;
                                                } else {
                                                    map = null;
                                                }
                                                if (map != null) {
                                                    arrayList2 = new ArrayList();
                                                    while (r10.hasNext()) {
                                                        key = entry.getKey();
                                                        if (!(key instanceof String)) {
                                                            key = null;
                                                        }
                                                        str4 = (String) key;
                                                        if (str4 != null) {
                                                            value2 = entry.getValue();
                                                            if (value2 == null) {
                                                                value2 = null;
                                                            }
                                                            if (value2 == null) {
                                                                pairM90091to = TuplesKt.m90091to(str4, value2);
                                                            }
                                                            if (pairM90091to != null) {
                                                                arrayList2.add(pairM90091to);
                                                            }
                                                        }
                                                        pairM90091to = null;
                                                        if (pairM90091to != null) {
                                                            arrayList2.add(pairM90091to);
                                                        }
                                                    }
                                                    map2 = MapsKt.toMap(arrayList2);
                                                    if (map2 == 0) {
                                                        objectRef.element = map2;
                                                    }
                                                }
                                                str3 = null;
                                            } else {
                                                obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                                if (!(obj instanceof String)) {
                                                    obj = null;
                                                }
                                                str3 = (String) obj;
                                            }
                                        }
                                    } else {
                                        str3 = null;
                                    }
                                    C28468k0 c28468k1 = C28468k0.f57983a;
                                    if (str3 != null) {
                                        sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                    } else {
                                        sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                    }
                                    listListOf = CollectionsKt.listOf(sNSSupportItem);
                                    function1 = C28468k0.f58003u;
                                    if (function1 != null) {
                                        function1.invoke(listListOf);
                                    }
                                }
                                Logger.DefaultImpls.v$default(C33272c.f67812a, "PrepareSDKUseCase", "SDK got the following data: Config is " + c29124h5 + ", Flow type is " + c29124h5.f59069b, null, 4, null);
                                FlowType flowType2 = c29124h5.f59069b;
                                StringBuilder sb3 = new StringBuilder();
                                sb3.append("SDK got the config for flow type ");
                                sb3.append(flowType2);
                                C33272c.f67816e.f67810a.mo68955d("PrepareSDKUseCase", sb3.toString(), null);
                                return new C29078Z(new C30079M(c29124h5, abstractC29172p2, c29983l));
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    ResultKt.throwOnFailure(objM69413a);
                    c29124h = (C29124h) objM69413a;
                    if (c29124h.f59068a.length() != 0) {
                        throw new SNSApplicantNotFoundException(null, 1, null);
                    }
                    InterfaceC29984m interfaceC29984m5 = this.f60454d;
                    c30080n.f60446a = c29124h;
                    c30080n.f60451f = 2;
                    objM70043a = ((C29967J) interfaceC29984m5).m70043a(true, (ContinuationImpl) c30080n);
                    if (objM70043a == coroutine_suspended) {
                        c29124h2 = c29124h;
                        objM69413a = objM70043a;
                        abstractC29172p = (AbstractC29172p) objM69413a;
                        if (AbstractC29130i.m69785k(c29124h2)) {
                            c29118g = c29124h2.f59091x;
                            if (c29118g != null) {
                                value = null;
                            } else {
                                value = null;
                            }
                            if (Intrinsics.areEqual(value, FlowActionType.DEPRECATED_FACE_ENROLLMENT_FLOW_ACTION_TYPE)) {
                                throw new SNSInvalidParametersException(CollectionsKt.listOf("\"" + FlowActionType.DEPRECATED_FACE_ENROLLMENT_FLOW_ACTION_TYPE + "\" action type is deprecated"));
                            }
                        }
                        if (!AbstractC29130i.m69785k(c29124h2)) {
                            str = abstractC29172p.mo69762m().f59171h;
                            if (str != null) {
                                C29903a c29903a3 = C28366e.f57832a;
                                C28366e.f57834c.put(GlobalStatePayload.LevelName, str);
                            } else {
                                C29903a c29903a4 = C28366e.f57832a;
                                C28366e.f57834c.remove(GlobalStatePayload.LevelName);
                            }
                            c29136jMo69755f = abstractC29172p.mo69755f();
                            if (c29136jMo69755f != null) {
                                C28366e.f57834c.remove(GlobalStatePayload.Country);
                            } else {
                                C28366e.f57834c.remove(GlobalStatePayload.Country);
                            }
                            List list3 = abstractC29172p.mo69760k().f59151a;
                            arrayList = new ArrayList();
                            it = list3.iterator();
                            while (it.hasNext()) {
                                c29070x = ((C29154m) it.next()).f59132a;
                                if (c29070x.m69750g()) {
                                    c29070x = null;
                                }
                                if (c29070x != null) {
                                    arrayList.add(c29070x);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                C30034c c30034c2 = this.f60452b;
                                c30080n.f60446a = c29124h2;
                                c30080n.f60447b = abstractC29172p;
                                c30080n.f60448c = arrayList;
                                c30080n.f60451f = 3;
                                objM69413a = c30034c2.m70075b(c30080n);
                                if (objM69413a != coroutine_suspended) {
                                    c29124h3 = c29124h2;
                                    list = arrayList;
                                    c30002b = this.f60453c;
                                    logType = LogType.Warn;
                                    c29124h4 = c29124h3;
                                    i11 = 0;
                                    logParams = new LogParams((String) null, "", (String) null, "PrepareSDKUseCase.kt", (String) objM69413a, "Unknown idDocSetType type: " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.domain.y0
                                        @Override // p852kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj3) {
                                            return C30081O.m70104a((C29070X) obj3);
                                        }
                                    }, 31, null), (String) null, "", 65, (DefaultConstructorMarker) null);
                                    c30080n.f60446a = c29124h4;
                                    c30080n.f60447b = abstractC29172p;
                                    c30080n.f60448c = null;
                                    c30080n.f60451f = 4;
                                    if (c30002b.f60286a.m70064a(logType.getValue(), AbstractC29722y2.m69913a(logParams), c30080n) == coroutine_suspended) {
                                        c29124h2 = c29124h4;
                                        InterfaceC29984m interfaceC29984m6 = this.f60454d;
                                        c30080n.f60446a = c29124h2;
                                        c30080n.f60447b = abstractC29172p;
                                        c30080n.f60451f = 5;
                                        objM69413a = ((C29967J) interfaceC29984m6).m70044b(c30080n);
                                        if (objM69413a == coroutine_suspended) {
                                            c29124h5 = c29124h2;
                                            abstractC29172p2 = abstractC29172p;
                                            c29983l = (C29983l) objM69413a;
                                            if (C28468k0.f57983a.getSupportItems() == null) {
                                                InterfaceC29953a interfaceC29953a3 = this.f58096a;
                                                c30080n.f60446a = c29124h5;
                                                c30080n.f60447b = abstractC29172p2;
                                                c30080n.f60448c = c29983l;
                                                c30080n.f60451f = 6;
                                                objM69413a = ((C29957e) interfaceC29953a3).m70035a(c30080n);
                                                if (objM69413a == coroutine_suspended) {
                                                }
                                                r11 = (Map) objM69413a;
                                                if (r11 != 0) {
                                                    char[] cArr3 = new char[1];
                                                    cArr3[i11] = (char) 47;
                                                    listSplit$default = StringsKt.split$default((CharSequence) "supportEmail", cArr3, false, 0, 6, (Object) null);
                                                    objectRef = new Ref.ObjectRef();
                                                    objectRef.element = r11;
                                                    it2 = RangesKt.until(i11, listSplit$default.size() - 1).iterator();
                                                    while (true) {
                                                        if (it2.hasNext()) {
                                                            obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it2).nextInt()));
                                                            if (obj2 instanceof Map) {
                                                                map = (Map) obj2;
                                                            } else {
                                                                map = null;
                                                            }
                                                            if (map != null) {
                                                                arrayList2 = new ArrayList();
                                                                while (r10.hasNext()) {
                                                                    key = entry.getKey();
                                                                    if (!(key instanceof String)) {
                                                                        key = null;
                                                                    }
                                                                    str4 = (String) key;
                                                                    if (str4 != null) {
                                                                        value2 = entry.getValue();
                                                                        if (value2 == null) {
                                                                            value2 = null;
                                                                        }
                                                                        if (value2 == null) {
                                                                            pairM90091to = TuplesKt.m90091to(str4, value2);
                                                                        }
                                                                        if (pairM90091to != null) {
                                                                            arrayList2.add(pairM90091to);
                                                                        }
                                                                    }
                                                                    pairM90091to = null;
                                                                    if (pairM90091to != null) {
                                                                        arrayList2.add(pairM90091to);
                                                                    }
                                                                }
                                                                map2 = MapsKt.toMap(arrayList2);
                                                                if (map2 == 0) {
                                                                    objectRef.element = map2;
                                                                }
                                                            }
                                                            str3 = null;
                                                        } else {
                                                            obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                                            if (!(obj instanceof String)) {
                                                                obj = null;
                                                            }
                                                            str3 = (String) obj;
                                                        }
                                                    }
                                                } else {
                                                    str3 = null;
                                                }
                                                C28468k0 c28468k2 = C28468k0.f57983a;
                                                if (str3 != null) {
                                                    sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                                } else {
                                                    sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                                }
                                                listListOf = CollectionsKt.listOf(sNSSupportItem);
                                                function1 = C28468k0.f58003u;
                                                if (function1 != null) {
                                                    function1.invoke(listListOf);
                                                }
                                            }
                                            Logger.DefaultImpls.v$default(C33272c.f67812a, "PrepareSDKUseCase", "SDK got the following data: Config is " + c29124h5 + ", Flow type is " + c29124h5.f59069b, null, 4, null);
                                            FlowType flowType3 = c29124h5.f59069b;
                                            StringBuilder sb4 = new StringBuilder();
                                            sb4.append("SDK got the config for flow type ");
                                            sb4.append(flowType3);
                                            C33272c.f67816e.f67810a.mo68955d("PrepareSDKUseCase", sb4.toString(), null);
                                            return new C29078Z(new C30079M(c29124h5, abstractC29172p2, c29983l));
                                        }
                                    }
                                }
                            }
                        }
                        i11 = 0;
                        InterfaceC29984m interfaceC29984m7 = this.f60454d;
                        c30080n.f60446a = c29124h2;
                        c30080n.f60447b = abstractC29172p;
                        c30080n.f60451f = 5;
                        objM69413a = ((C29967J) interfaceC29984m7).m70044b(c30080n);
                        if (objM69413a == coroutine_suspended) {
                            c29124h5 = c29124h2;
                            abstractC29172p2 = abstractC29172p;
                            c29983l = (C29983l) objM69413a;
                            if (C28468k0.f57983a.getSupportItems() == null) {
                                InterfaceC29953a interfaceC29953a4 = this.f58096a;
                                c30080n.f60446a = c29124h5;
                                c30080n.f60447b = abstractC29172p2;
                                c30080n.f60448c = c29983l;
                                c30080n.f60451f = 6;
                                objM69413a = ((C29957e) interfaceC29953a4).m70035a(c30080n);
                                if (objM69413a == coroutine_suspended) {
                                }
                                r11 = (Map) objM69413a;
                                if (r11 != 0) {
                                    char[] cArr4 = new char[1];
                                    cArr4[i11] = (char) 47;
                                    listSplit$default = StringsKt.split$default((CharSequence) "supportEmail", cArr4, false, 0, 6, (Object) null);
                                    objectRef = new Ref.ObjectRef();
                                    objectRef.element = r11;
                                    it2 = RangesKt.until(i11, listSplit$default.size() - 1).iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it2).nextInt()));
                                            if (obj2 instanceof Map) {
                                                map = (Map) obj2;
                                            } else {
                                                map = null;
                                            }
                                            if (map != null) {
                                                arrayList2 = new ArrayList();
                                                while (r10.hasNext()) {
                                                    key = entry.getKey();
                                                    if (!(key instanceof String)) {
                                                        key = null;
                                                    }
                                                    str4 = (String) key;
                                                    if (str4 != null) {
                                                        value2 = entry.getValue();
                                                        if (value2 == null) {
                                                            value2 = null;
                                                        }
                                                        if (value2 == null) {
                                                            pairM90091to = TuplesKt.m90091to(str4, value2);
                                                        }
                                                        if (pairM90091to != null) {
                                                            arrayList2.add(pairM90091to);
                                                        }
                                                    }
                                                    pairM90091to = null;
                                                    if (pairM90091to != null) {
                                                        arrayList2.add(pairM90091to);
                                                    }
                                                }
                                                map2 = MapsKt.toMap(arrayList2);
                                                if (map2 == 0) {
                                                    objectRef.element = map2;
                                                }
                                            }
                                            str3 = null;
                                        } else {
                                            obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                            if (!(obj instanceof String)) {
                                                obj = null;
                                            }
                                            str3 = (String) obj;
                                        }
                                    }
                                } else {
                                    str3 = null;
                                }
                                C28468k0 c28468k3 = C28468k0.f57983a;
                                if (str3 != null) {
                                    sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                } else {
                                    sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                }
                                listListOf = CollectionsKt.listOf(sNSSupportItem);
                                function1 = C28468k0.f58003u;
                                if (function1 != null) {
                                    function1.invoke(listListOf);
                                }
                            }
                            Logger.DefaultImpls.v$default(C33272c.f67812a, "PrepareSDKUseCase", "SDK got the following data: Config is " + c29124h5 + ", Flow type is " + c29124h5.f59069b, null, 4, null);
                            FlowType flowType4 = c29124h5.f59069b;
                            StringBuilder sb5 = new StringBuilder();
                            sb5.append("SDK got the config for flow type ");
                            sb5.append(flowType4);
                            C33272c.f67816e.f67810a.mo68955d("PrepareSDKUseCase", sb5.toString(), null);
                            return new C29078Z(new C30079M(c29124h5, abstractC29172p2, c29983l));
                        }
                    }
                    return coroutine_suspended;
                case 2:
                    C29124h c29124h6 = c30080n.f60446a;
                    ResultKt.throwOnFailure(objM69413a);
                    c29124h2 = c29124h6;
                    abstractC29172p = (AbstractC29172p) objM69413a;
                    if (AbstractC29130i.m69785k(c29124h2)) {
                        c29118g = c29124h2.f59091x;
                        if (c29118g != null) {
                            value = null;
                        } else {
                            value = null;
                        }
                        if (Intrinsics.areEqual(value, FlowActionType.DEPRECATED_FACE_ENROLLMENT_FLOW_ACTION_TYPE)) {
                            throw new SNSInvalidParametersException(CollectionsKt.listOf("\"" + FlowActionType.DEPRECATED_FACE_ENROLLMENT_FLOW_ACTION_TYPE + "\" action type is deprecated"));
                        }
                    }
                    if (!AbstractC29130i.m69785k(c29124h2)) {
                        str = abstractC29172p.mo69762m().f59171h;
                        if (str != null) {
                            C29903a c29903a5 = C28366e.f57832a;
                            C28366e.f57834c.put(GlobalStatePayload.LevelName, str);
                        } else {
                            C29903a c29903a6 = C28366e.f57832a;
                            C28366e.f57834c.remove(GlobalStatePayload.LevelName);
                        }
                        c29136jMo69755f = abstractC29172p.mo69755f();
                        if (c29136jMo69755f != null) {
                            C28366e.f57834c.remove(GlobalStatePayload.Country);
                        } else {
                            C28366e.f57834c.remove(GlobalStatePayload.Country);
                        }
                        List list4 = abstractC29172p.mo69760k().f59151a;
                        arrayList = new ArrayList();
                        it = list4.iterator();
                        while (it.hasNext()) {
                            c29070x = ((C29154m) it.next()).f59132a;
                            if (c29070x.m69750g()) {
                                c29070x = null;
                            }
                            if (c29070x != null) {
                                arrayList.add(c29070x);
                            }
                        }
                        if (!arrayList.isEmpty()) {
                            C30034c c30034c3 = this.f60452b;
                            c30080n.f60446a = c29124h2;
                            c30080n.f60447b = abstractC29172p;
                            c30080n.f60448c = arrayList;
                            c30080n.f60451f = 3;
                            objM69413a = c30034c3.m70075b(c30080n);
                            if (objM69413a != coroutine_suspended) {
                                c29124h3 = c29124h2;
                                list = arrayList;
                                c30002b = this.f60453c;
                                logType = LogType.Warn;
                                c29124h4 = c29124h3;
                                i11 = 0;
                                logParams = new LogParams((String) null, "", (String) null, "PrepareSDKUseCase.kt", (String) objM69413a, "Unknown idDocSetType type: " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.domain.y0
                                    @Override // p852kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj3) {
                                        return C30081O.m70104a((C29070X) obj3);
                                    }
                                }, 31, null), (String) null, "", 65, (DefaultConstructorMarker) null);
                                c30080n.f60446a = c29124h4;
                                c30080n.f60447b = abstractC29172p;
                                c30080n.f60448c = null;
                                c30080n.f60451f = 4;
                                if (c30002b.f60286a.m70064a(logType.getValue(), AbstractC29722y2.m69913a(logParams), c30080n) == coroutine_suspended) {
                                    c29124h2 = c29124h4;
                                    InterfaceC29984m interfaceC29984m8 = this.f60454d;
                                    c30080n.f60446a = c29124h2;
                                    c30080n.f60447b = abstractC29172p;
                                    c30080n.f60451f = 5;
                                    objM69413a = ((C29967J) interfaceC29984m8).m70044b(c30080n);
                                    if (objM69413a == coroutine_suspended) {
                                        c29124h5 = c29124h2;
                                        abstractC29172p2 = abstractC29172p;
                                        c29983l = (C29983l) objM69413a;
                                        if (C28468k0.f57983a.getSupportItems() == null) {
                                            InterfaceC29953a interfaceC29953a5 = this.f58096a;
                                            c30080n.f60446a = c29124h5;
                                            c30080n.f60447b = abstractC29172p2;
                                            c30080n.f60448c = c29983l;
                                            c30080n.f60451f = 6;
                                            objM69413a = ((C29957e) interfaceC29953a5).m70035a(c30080n);
                                            if (objM69413a == coroutine_suspended) {
                                            }
                                            r11 = (Map) objM69413a;
                                            if (r11 != 0) {
                                                char[] cArr5 = new char[1];
                                                cArr5[i11] = (char) 47;
                                                listSplit$default = StringsKt.split$default((CharSequence) "supportEmail", cArr5, false, 0, 6, (Object) null);
                                                objectRef = new Ref.ObjectRef();
                                                objectRef.element = r11;
                                                it2 = RangesKt.until(i11, listSplit$default.size() - 1).iterator();
                                                while (true) {
                                                    if (it2.hasNext()) {
                                                        obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it2).nextInt()));
                                                        if (obj2 instanceof Map) {
                                                            map = (Map) obj2;
                                                        } else {
                                                            map = null;
                                                        }
                                                        if (map != null) {
                                                            arrayList2 = new ArrayList();
                                                            while (r10.hasNext()) {
                                                                key = entry.getKey();
                                                                if (!(key instanceof String)) {
                                                                    key = null;
                                                                }
                                                                str4 = (String) key;
                                                                if (str4 != null) {
                                                                    value2 = entry.getValue();
                                                                    if (value2 == null) {
                                                                        value2 = null;
                                                                    }
                                                                    if (value2 == null) {
                                                                        pairM90091to = TuplesKt.m90091to(str4, value2);
                                                                    }
                                                                    if (pairM90091to != null) {
                                                                        arrayList2.add(pairM90091to);
                                                                    }
                                                                }
                                                                pairM90091to = null;
                                                                if (pairM90091to != null) {
                                                                    arrayList2.add(pairM90091to);
                                                                }
                                                            }
                                                            map2 = MapsKt.toMap(arrayList2);
                                                            if (map2 == 0) {
                                                                objectRef.element = map2;
                                                            }
                                                        }
                                                        str3 = null;
                                                    } else {
                                                        obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                                        if (!(obj instanceof String)) {
                                                            obj = null;
                                                        }
                                                        str3 = (String) obj;
                                                    }
                                                }
                                            } else {
                                                str3 = null;
                                            }
                                            C28468k0 c28468k4 = C28468k0.f57983a;
                                            if (str3 != null) {
                                                sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                            } else {
                                                sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                            }
                                            listListOf = CollectionsKt.listOf(sNSSupportItem);
                                            function1 = C28468k0.f58003u;
                                            if (function1 != null) {
                                                function1.invoke(listListOf);
                                            }
                                        }
                                        Logger.DefaultImpls.v$default(C33272c.f67812a, "PrepareSDKUseCase", "SDK got the following data: Config is " + c29124h5 + ", Flow type is " + c29124h5.f59069b, null, 4, null);
                                        FlowType flowType5 = c29124h5.f59069b;
                                        StringBuilder sb6 = new StringBuilder();
                                        sb6.append("SDK got the config for flow type ");
                                        sb6.append(flowType5);
                                        C33272c.f67816e.f67810a.mo68955d("PrepareSDKUseCase", sb6.toString(), null);
                                        return new C29078Z(new C30079M(c29124h5, abstractC29172p2, c29983l));
                                    }
                                }
                            }
                        }
                        return coroutine_suspended;
                    }
                    i11 = 0;
                    InterfaceC29984m interfaceC29984m9 = this.f60454d;
                    c30080n.f60446a = c29124h2;
                    c30080n.f60447b = abstractC29172p;
                    c30080n.f60451f = 5;
                    objM69413a = ((C29967J) interfaceC29984m9).m70044b(c30080n);
                    if (objM69413a == coroutine_suspended) {
                        c29124h5 = c29124h2;
                        abstractC29172p2 = abstractC29172p;
                        c29983l = (C29983l) objM69413a;
                        if (C28468k0.f57983a.getSupportItems() == null) {
                            InterfaceC29953a interfaceC29953a6 = this.f58096a;
                            c30080n.f60446a = c29124h5;
                            c30080n.f60447b = abstractC29172p2;
                            c30080n.f60448c = c29983l;
                            c30080n.f60451f = 6;
                            objM69413a = ((C29957e) interfaceC29953a6).m70035a(c30080n);
                            if (objM69413a == coroutine_suspended) {
                            }
                            r11 = (Map) objM69413a;
                            if (r11 != 0) {
                                char[] cArr6 = new char[1];
                                cArr6[i11] = (char) 47;
                                listSplit$default = StringsKt.split$default((CharSequence) "supportEmail", cArr6, false, 0, 6, (Object) null);
                                objectRef = new Ref.ObjectRef();
                                objectRef.element = r11;
                                it2 = RangesKt.until(i11, listSplit$default.size() - 1).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it2).nextInt()));
                                        if (obj2 instanceof Map) {
                                            map = (Map) obj2;
                                        } else {
                                            map = null;
                                        }
                                        if (map != null) {
                                            arrayList2 = new ArrayList();
                                            while (r10.hasNext()) {
                                                key = entry.getKey();
                                                if (!(key instanceof String)) {
                                                    key = null;
                                                }
                                                str4 = (String) key;
                                                if (str4 != null) {
                                                    value2 = entry.getValue();
                                                    if (value2 == null) {
                                                        value2 = null;
                                                    }
                                                    if (value2 == null) {
                                                        pairM90091to = TuplesKt.m90091to(str4, value2);
                                                    }
                                                    if (pairM90091to != null) {
                                                        arrayList2.add(pairM90091to);
                                                    }
                                                }
                                                pairM90091to = null;
                                                if (pairM90091to != null) {
                                                    arrayList2.add(pairM90091to);
                                                }
                                            }
                                            map2 = MapsKt.toMap(arrayList2);
                                            if (map2 == 0) {
                                                objectRef.element = map2;
                                            }
                                        }
                                        str3 = null;
                                    } else {
                                        obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                        if (!(obj instanceof String)) {
                                            obj = null;
                                        }
                                        str3 = (String) obj;
                                    }
                                }
                            } else {
                                str3 = null;
                            }
                            C28468k0 c28468k5 = C28468k0.f57983a;
                            if (str3 != null) {
                                sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                            } else {
                                sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                            }
                            listListOf = CollectionsKt.listOf(sNSSupportItem);
                            function1 = C28468k0.f58003u;
                            if (function1 != null) {
                                function1.invoke(listListOf);
                            }
                        }
                        Logger.DefaultImpls.v$default(C33272c.f67812a, "PrepareSDKUseCase", "SDK got the following data: Config is " + c29124h5 + ", Flow type is " + c29124h5.f59069b, null, 4, null);
                        FlowType flowType6 = c29124h5.f59069b;
                        StringBuilder sb7 = new StringBuilder();
                        sb7.append("SDK got the config for flow type ");
                        sb7.append(flowType6);
                        C33272c.f67816e.f67810a.mo68955d("PrepareSDKUseCase", sb7.toString(), null);
                        return new C29078Z(new C30079M(c29124h5, abstractC29172p2, c29983l));
                    }
                    return coroutine_suspended;
                case 3:
                    List list5 = (List) c30080n.f60448c;
                    AbstractC29172p abstractC29172p3 = c30080n.f60447b;
                    c29124h3 = c30080n.f60446a;
                    ResultKt.throwOnFailure(objM69413a);
                    list = list5;
                    abstractC29172p = abstractC29172p3;
                    c30002b = this.f60453c;
                    logType = LogType.Warn;
                    c29124h4 = c29124h3;
                    i11 = 0;
                    logParams = new LogParams((String) null, "", (String) null, "PrepareSDKUseCase.kt", (String) objM69413a, "Unknown idDocSetType type: " + CollectionsKt.joinToString$default(list, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.domain.y0
                        @Override // p852kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj3) {
                            return C30081O.m70104a((C29070X) obj3);
                        }
                    }, 31, null), (String) null, "", 65, (DefaultConstructorMarker) null);
                    c30080n.f60446a = c29124h4;
                    c30080n.f60447b = abstractC29172p;
                    c30080n.f60448c = null;
                    c30080n.f60451f = 4;
                    if (c30002b.f60286a.m70064a(logType.getValue(), AbstractC29722y2.m69913a(logParams), c30080n) == coroutine_suspended) {
                        c29124h2 = c29124h4;
                        InterfaceC29984m interfaceC29984m10 = this.f60454d;
                        c30080n.f60446a = c29124h2;
                        c30080n.f60447b = abstractC29172p;
                        c30080n.f60451f = 5;
                        objM69413a = ((C29967J) interfaceC29984m10).m70044b(c30080n);
                        if (objM69413a == coroutine_suspended) {
                            c29124h5 = c29124h2;
                            abstractC29172p2 = abstractC29172p;
                            c29983l = (C29983l) objM69413a;
                            if (C28468k0.f57983a.getSupportItems() == null) {
                                InterfaceC29953a interfaceC29953a7 = this.f58096a;
                                c30080n.f60446a = c29124h5;
                                c30080n.f60447b = abstractC29172p2;
                                c30080n.f60448c = c29983l;
                                c30080n.f60451f = 6;
                                objM69413a = ((C29957e) interfaceC29953a7).m70035a(c30080n);
                                if (objM69413a == coroutine_suspended) {
                                }
                                r11 = (Map) objM69413a;
                                if (r11 != 0) {
                                    char[] cArr7 = new char[1];
                                    cArr7[i11] = (char) 47;
                                    listSplit$default = StringsKt.split$default((CharSequence) "supportEmail", cArr7, false, 0, 6, (Object) null);
                                    objectRef = new Ref.ObjectRef();
                                    objectRef.element = r11;
                                    it2 = RangesKt.until(i11, listSplit$default.size() - 1).iterator();
                                    while (true) {
                                        if (it2.hasNext()) {
                                            obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it2).nextInt()));
                                            if (obj2 instanceof Map) {
                                                map = (Map) obj2;
                                            } else {
                                                map = null;
                                            }
                                            if (map != null) {
                                                arrayList2 = new ArrayList();
                                                while (r10.hasNext()) {
                                                    key = entry.getKey();
                                                    if (!(key instanceof String)) {
                                                        key = null;
                                                    }
                                                    str4 = (String) key;
                                                    if (str4 != null) {
                                                        value2 = entry.getValue();
                                                        if (value2 == null) {
                                                            value2 = null;
                                                        }
                                                        if (value2 == null) {
                                                            pairM90091to = TuplesKt.m90091to(str4, value2);
                                                        }
                                                        if (pairM90091to != null) {
                                                            arrayList2.add(pairM90091to);
                                                        }
                                                    }
                                                    pairM90091to = null;
                                                    if (pairM90091to != null) {
                                                        arrayList2.add(pairM90091to);
                                                    }
                                                }
                                                map2 = MapsKt.toMap(arrayList2);
                                                if (map2 == 0) {
                                                    objectRef.element = map2;
                                                }
                                            }
                                            str3 = null;
                                        } else {
                                            obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                            if (!(obj instanceof String)) {
                                                obj = null;
                                            }
                                            str3 = (String) obj;
                                        }
                                    }
                                } else {
                                    str3 = null;
                                }
                                C28468k0 c28468k6 = C28468k0.f57983a;
                                if (str3 != null) {
                                    sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                } else {
                                    sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                                }
                                listListOf = CollectionsKt.listOf(sNSSupportItem);
                                function1 = C28468k0.f58003u;
                                if (function1 != null) {
                                    function1.invoke(listListOf);
                                }
                            }
                            Logger.DefaultImpls.v$default(C33272c.f67812a, "PrepareSDKUseCase", "SDK got the following data: Config is " + c29124h5 + ", Flow type is " + c29124h5.f59069b, null, 4, null);
                            FlowType flowType7 = c29124h5.f59069b;
                            StringBuilder sb8 = new StringBuilder();
                            sb8.append("SDK got the config for flow type ");
                            sb8.append(flowType7);
                            C33272c.f67816e.f67810a.mo68955d("PrepareSDKUseCase", sb8.toString(), null);
                            return new C29078Z(new C30079M(c29124h5, abstractC29172p2, c29983l));
                        }
                    }
                    return coroutine_suspended;
                case 4:
                    abstractC29172p = c30080n.f60447b;
                    c29124h2 = c30080n.f60446a;
                    ResultKt.throwOnFailure(objM69413a);
                    i11 = 0;
                    InterfaceC29984m interfaceC29984m11 = this.f60454d;
                    c30080n.f60446a = c29124h2;
                    c30080n.f60447b = abstractC29172p;
                    c30080n.f60451f = 5;
                    objM69413a = ((C29967J) interfaceC29984m11).m70044b(c30080n);
                    if (objM69413a == coroutine_suspended) {
                        c29124h5 = c29124h2;
                        abstractC29172p2 = abstractC29172p;
                        c29983l = (C29983l) objM69413a;
                        if (C28468k0.f57983a.getSupportItems() == null) {
                            InterfaceC29953a interfaceC29953a8 = this.f58096a;
                            c30080n.f60446a = c29124h5;
                            c30080n.f60447b = abstractC29172p2;
                            c30080n.f60448c = c29983l;
                            c30080n.f60451f = 6;
                            objM69413a = ((C29957e) interfaceC29953a8).m70035a(c30080n);
                            if (objM69413a == coroutine_suspended) {
                            }
                            r11 = (Map) objM69413a;
                            if (r11 != 0) {
                                char[] cArr8 = new char[1];
                                cArr8[i11] = (char) 47;
                                listSplit$default = StringsKt.split$default((CharSequence) "supportEmail", cArr8, false, 0, 6, (Object) null);
                                objectRef = new Ref.ObjectRef();
                                objectRef.element = r11;
                                it2 = RangesKt.until(i11, listSplit$default.size() - 1).iterator();
                                while (true) {
                                    if (it2.hasNext()) {
                                        obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it2).nextInt()));
                                        if (obj2 instanceof Map) {
                                            map = (Map) obj2;
                                        } else {
                                            map = null;
                                        }
                                        if (map != null) {
                                            arrayList2 = new ArrayList();
                                            while (r10.hasNext()) {
                                                key = entry.getKey();
                                                if (!(key instanceof String)) {
                                                    key = null;
                                                }
                                                str4 = (String) key;
                                                if (str4 != null) {
                                                    value2 = entry.getValue();
                                                    if (value2 == null) {
                                                        value2 = null;
                                                    }
                                                    if (value2 == null) {
                                                        pairM90091to = TuplesKt.m90091to(str4, value2);
                                                    }
                                                    if (pairM90091to != null) {
                                                        arrayList2.add(pairM90091to);
                                                    }
                                                }
                                                pairM90091to = null;
                                                if (pairM90091to != null) {
                                                    arrayList2.add(pairM90091to);
                                                }
                                            }
                                            map2 = MapsKt.toMap(arrayList2);
                                            if (map2 == 0) {
                                                objectRef.element = map2;
                                            }
                                        }
                                        str3 = null;
                                    } else {
                                        obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                        if (!(obj instanceof String)) {
                                            obj = null;
                                        }
                                        str3 = (String) obj;
                                    }
                                }
                            } else {
                                str3 = null;
                            }
                            C28468k0 c28468k7 = C28468k0.f57983a;
                            if (str3 != null) {
                                sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                            } else {
                                sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                            }
                            listListOf = CollectionsKt.listOf(sNSSupportItem);
                            function1 = C28468k0.f58003u;
                            if (function1 != null) {
                                function1.invoke(listListOf);
                            }
                        }
                        Logger.DefaultImpls.v$default(C33272c.f67812a, "PrepareSDKUseCase", "SDK got the following data: Config is " + c29124h5 + ", Flow type is " + c29124h5.f59069b, null, 4, null);
                        FlowType flowType8 = c29124h5.f59069b;
                        StringBuilder sb9 = new StringBuilder();
                        sb9.append("SDK got the config for flow type ");
                        sb9.append(flowType8);
                        C33272c.f67816e.f67810a.mo68955d("PrepareSDKUseCase", sb9.toString(), null);
                        return new C29078Z(new C30079M(c29124h5, abstractC29172p2, c29983l));
                    }
                    return coroutine_suspended;
                case 5:
                    abstractC29172p = c30080n.f60447b;
                    c29124h2 = c30080n.f60446a;
                    ResultKt.throwOnFailure(objM69413a);
                    i11 = 0;
                    c29124h5 = c29124h2;
                    abstractC29172p2 = abstractC29172p;
                    c29983l = (C29983l) objM69413a;
                    if (C28468k0.f57983a.getSupportItems() == null) {
                        InterfaceC29953a interfaceC29953a9 = this.f58096a;
                        c30080n.f60446a = c29124h5;
                        c30080n.f60447b = abstractC29172p2;
                        c30080n.f60448c = c29983l;
                        c30080n.f60451f = 6;
                        objM69413a = ((C29957e) interfaceC29953a9).m70035a(c30080n);
                        if (objM69413a == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        r11 = (Map) objM69413a;
                        if (r11 != 0) {
                            char[] cArr9 = new char[1];
                            cArr9[i11] = (char) 47;
                            listSplit$default = StringsKt.split$default((CharSequence) "supportEmail", cArr9, false, 0, 6, (Object) null);
                            objectRef = new Ref.ObjectRef();
                            objectRef.element = r11;
                            it2 = RangesKt.until(i11, listSplit$default.size() - 1).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it2).nextInt()));
                                    if (obj2 instanceof Map) {
                                        map = (Map) obj2;
                                    } else {
                                        map = null;
                                    }
                                    if (map != null) {
                                        arrayList2 = new ArrayList();
                                        while (r10.hasNext()) {
                                            key = entry.getKey();
                                            if (!(key instanceof String)) {
                                                key = null;
                                            }
                                            str4 = (String) key;
                                            if (str4 != null) {
                                                value2 = entry.getValue();
                                                if (value2 == null) {
                                                    value2 = null;
                                                }
                                                if (value2 == null) {
                                                    pairM90091to = TuplesKt.m90091to(str4, value2);
                                                }
                                                if (pairM90091to != null) {
                                                    arrayList2.add(pairM90091to);
                                                }
                                            }
                                            pairM90091to = null;
                                            if (pairM90091to != null) {
                                                arrayList2.add(pairM90091to);
                                            }
                                        }
                                        map2 = MapsKt.toMap(arrayList2);
                                        if (map2 == 0) {
                                            objectRef.element = map2;
                                        }
                                    }
                                    str3 = null;
                                } else {
                                    obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                    if (!(obj instanceof String)) {
                                        obj = null;
                                    }
                                    str3 = (String) obj;
                                }
                            }
                        } else {
                            str3 = null;
                        }
                        C28468k0 c28468k8 = C28468k0.f57983a;
                        if (str3 != null) {
                            sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                        } else {
                            sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                        }
                        listListOf = CollectionsKt.listOf(sNSSupportItem);
                        function1 = C28468k0.f58003u;
                        if (function1 != null) {
                            function1.invoke(listListOf);
                        }
                    }
                    Logger.DefaultImpls.v$default(C33272c.f67812a, "PrepareSDKUseCase", "SDK got the following data: Config is " + c29124h5 + ", Flow type is " + c29124h5.f59069b, null, 4, null);
                    FlowType flowType9 = c29124h5.f59069b;
                    StringBuilder sb10 = new StringBuilder();
                    sb10.append("SDK got the config for flow type ");
                    sb10.append(flowType9);
                    C33272c.f67816e.f67810a.mo68955d("PrepareSDKUseCase", sb10.toString(), null);
                    return new C29078Z(new C30079M(c29124h5, abstractC29172p2, c29983l));
                case 6:
                    c29983l = (C29983l) c30080n.f60448c;
                    abstractC29172p2 = c30080n.f60447b;
                    c29124h5 = c30080n.f60446a;
                    ResultKt.throwOnFailure(objM69413a);
                    i11 = 0;
                    r11 = (Map) objM69413a;
                    if (r11 != 0) {
                        char[] cArr10 = new char[1];
                        cArr10[i11] = (char) 47;
                        listSplit$default = StringsKt.split$default((CharSequence) "supportEmail", cArr10, false, 0, 6, (Object) null);
                        objectRef = new Ref.ObjectRef();
                        objectRef.element = r11;
                        it2 = RangesKt.until(i11, listSplit$default.size() - 1).iterator();
                        while (true) {
                            if (it2.hasNext()) {
                                obj2 = ((Map) objectRef.element).get(listSplit$default.get(((IntIterator) it2).nextInt()));
                                if (obj2 instanceof Map) {
                                    map = (Map) obj2;
                                } else {
                                    map = null;
                                }
                                if (map != null) {
                                    arrayList2 = new ArrayList();
                                    while (r10.hasNext()) {
                                        key = entry.getKey();
                                        if (!(key instanceof String)) {
                                            key = null;
                                        }
                                        str4 = (String) key;
                                        if (str4 != null) {
                                            value2 = entry.getValue();
                                            if (value2 == null) {
                                                value2 = null;
                                            }
                                            if (value2 == null) {
                                                pairM90091to = TuplesKt.m90091to(str4, value2);
                                            }
                                            if (pairM90091to != null) {
                                                arrayList2.add(pairM90091to);
                                            }
                                        }
                                        pairM90091to = null;
                                        if (pairM90091to != null) {
                                            arrayList2.add(pairM90091to);
                                        }
                                    }
                                    map2 = MapsKt.toMap(arrayList2);
                                    if (map2 == 0) {
                                        objectRef.element = map2;
                                    }
                                }
                                str3 = null;
                            } else {
                                obj = ((Map) objectRef.element).get(CollectionsKt.lastOrNull(listSplit$default));
                                if (!(obj instanceof String)) {
                                    obj = null;
                                }
                                str3 = (String) obj;
                            }
                        }
                    } else {
                        str3 = null;
                    }
                    C28468k0 c28468k9 = C28468k0.f57983a;
                    if (str3 != null) {
                        sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                    } else {
                        sNSSupportItem = new SNSSupportItem(c29983l.m70061a("sns_support_URL_title"), c29983l.m70061a("sns_support_URL_description"), SNSSupportItem.Type.Url, "https://support.sumsub.com/hc/", null, SNSIconHandler.SNSCommonIcons.MAIL.getImageName(), null, 80, null);
                    }
                    listListOf = CollectionsKt.listOf(sNSSupportItem);
                    function1 = C28468k0.f58003u;
                    if (function1 != null) {
                        function1.invoke(listListOf);
                    }
                    Logger.DefaultImpls.v$default(C33272c.f67812a, "PrepareSDKUseCase", "SDK got the following data: Config is " + c29124h5 + ", Flow type is " + c29124h5.f59069b, null, 4, null);
                    FlowType flowType10 = c29124h5.f59069b;
                    StringBuilder sb11 = new StringBuilder();
                    sb11.append("SDK got the config for flow type ");
                    sb11.append(flowType10);
                    C33272c.f67816e.f67810a.mo68955d("PrepareSDKUseCase", sb11.toString(), null);
                    return new C29078Z(new C30079M(c29124h5, abstractC29172p2, c29983l));
                case 7:
                    ResultKt.throwOnFailure(objM69413a);
                    return new C29074Y(objM69413a);
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (SNSApplicantNotFoundException e11) {
            c30080n.f60446a = null;
            c30080n.f60447b = null;
            c30080n.f60448c = null;
            c30080n.f60451f = 7;
            objM69413a = AbstractC28543c.m69413a(this.f58096a, e11);
        } catch (Exception e12) {
            ((C29957e) this.f58096a).m70036a(e12 instanceof SNSInvalidParametersException ? new SNSSDKState.Failed.InvalidParameters(((SNSInvalidParametersException) e12).getMessages()) : new SNSSDKState.Failed.InitialLoadingFailed(e12));
            return new C29074Y(e12);
        }
    }
}
