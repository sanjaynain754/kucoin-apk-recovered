package com.sumsub.sns.internal.features.presentation.status;

import android.text.Spanned;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModelKt;
import com.sumsub.sns.core.data.listener.SNSEvent;
import com.sumsub.sns.core.data.listener.SNSEventHandler;
import com.sumsub.sns.core.data.model.SNSSDKState;
import com.sumsub.sns.core.presentation.base.AbstractC28052C;
import com.sumsub.sns.core.presentation.base.AbstractC28073M0;
import com.sumsub.sns.core.presentation.base.InterfaceC28147s;
import com.sumsub.sns.internal.core.common.AbstractC28421U;
import com.sumsub.sns.internal.core.common.AbstractC28462i0;
import com.sumsub.sns.internal.core.common.C28447d1;
import com.sumsub.sns.internal.core.common.C28468k0;
import com.sumsub.sns.internal.core.common.C28494t;
import com.sumsub.sns.internal.core.common.C28500v;
import com.sumsub.sns.internal.core.domain.C28547d;
import com.sumsub.sns.internal.core.presentation.android.AbstractC28639a;
import com.sumsub.sns.internal.core.presentation.base.adapter.C28713b;
import com.sumsub.sns.internal.core.presentation.base.adapter.C28714c;
import com.sumsub.sns.internal.core.presentation.base.adapter.C28715d;
import com.sumsub.sns.internal.core.presentation.base.adapter.C28716e;
import com.sumsub.sns.internal.core.presentation.base.adapter.SNSDocumentViewTypeInfo$Type;
import com.sumsub.sns.internal.core.presentation.helper.AbstractC28878b;
import com.sumsub.sns.internal.core.presentation.helper.C28879c;
import com.sumsub.sns.internal.core.presentation.intro.C28890b;
import com.sumsub.sns.internal.core.presentation.intro.IntroScene;
import com.sumsub.sns.internal.core.presentation.screen.base.C28936t;
import com.sumsub.sns.internal.core.presentation.widget.SNSStepState;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29007H;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29130i;
import com.sumsub.sns.internal.features.data.model.common.AbstractC29172p;
import com.sumsub.sns.internal.features.data.model.common.ApplicantStatus;
import com.sumsub.sns.internal.features.data.model.common.C28984B3;
import com.sumsub.sns.internal.features.data.model.common.C28994D3;
import com.sumsub.sns.internal.features.data.model.common.C29070X;
import com.sumsub.sns.internal.features.data.model.common.C29124h;
import com.sumsub.sns.internal.features.data.model.common.C29140j3;
import com.sumsub.sns.internal.features.data.model.common.C29164n3;
import com.sumsub.sns.internal.features.data.model.common.C29713w3;
import com.sumsub.sns.internal.features.data.model.common.Document;
import com.sumsub.sns.internal.features.data.model.common.ReviewAnswerType;
import com.sumsub.sns.internal.features.data.model.common.ReviewRejectType;
import com.sumsub.sns.internal.features.data.model.common.ReviewStatusType;
import com.sumsub.sns.internal.features.data.model.common.SumsubIdType;
import com.sumsub.sns.internal.features.data.repository.applicant.InterfaceC29921d;
import com.sumsub.sns.internal.features.data.repository.common.C29957e;
import com.sumsub.sns.internal.features.data.repository.common.InterfaceC29953a;
import com.sumsub.sns.internal.features.data.repository.dynamic.AbstractC29971N;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29967J;
import com.sumsub.sns.internal.features.data.repository.dynamic.C29983l;
import com.sumsub.sns.internal.features.data.repository.dynamic.InterfaceC29984m;
import com.sumsub.sns.internal.features.data.repository.extensions.InterfaceC30000a;
import com.sumsub.sns.internal.features.domain.C30088W;
import com.sumsub.sns.internal.features.domain.C30336z;
import com.sumsub.sns.internal.features.presentation.main.C31288j2;
import com.sumsub.sns.internal.features.presentation.utils.C32641a;
import com.sumsub.sns.internal.features.presentation.utils.C32649e;
import com.sumsub.sns.internal.log.C33270a;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.p125ff.C33048a;
import com.sumsub.sns.internal.p125ff.core.C33050a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.InterfaceC41775x1;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41634e;
import p852kotlin.NoWhenBranchMatchedException;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.reflect.KProperty;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.sumsub.sns.internal.features.presentation.status.L */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C32403L extends AbstractC28073M0 {

    /* JADX INFO: renamed from: o */
    public static final /* synthetic */ KProperty[] f66041o = {AbstractC28639a.m69485a(C32403L.class, "sumsubIdChecked", "getSumsubIdChecked()Z", 0)};

    /* JADX INFO: renamed from: a */
    public final InterfaceC29953a f66042a;

    /* JADX INFO: renamed from: b */
    public final C30088W f66043b;

    /* JADX INFO: renamed from: c */
    public final C30336z f66044c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC29984m f66045d;

    /* JADX INFO: renamed from: e */
    public final InterfaceC29921d f66046e;

    /* JADX INFO: renamed from: f */
    public final InterfaceC30000a f66047f;

    /* JADX INFO: renamed from: g */
    public final C32649e f66048g;

    /* JADX INFO: renamed from: h */
    public final InterfaceC41634e f66049h;

    /* JADX INFO: renamed from: i */
    public final InterfaceC41634e f66050i;

    /* JADX INFO: renamed from: j */
    public AbstractC29172p f66051j;

    /* JADX INFO: renamed from: k */
    public List f66052k;

    /* JADX INFO: renamed from: l */
    public ApplicantStatus f66053l;

    /* JADX INFO: renamed from: m */
    public InterfaceC41775x1 f66054m;

    /* JADX INFO: renamed from: n */
    public final C28936t f66055n;

    /* JADX WARN: Code duplicated, block: B:28:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:29:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:40:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:44:0x0111  */
    /* JADX WARN: Code duplicated, block: B:46:0x0114  */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:59:0x0179  */
    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00d4, code lost:
    
        if (r15 == r1) goto L56;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object m71113a(C32403L c32403l, ContinuationImpl continuationImpl) {
        C32453v c32453v;
        C28890b c28890b;
        String str;
        Map map;
        Object obj;
        String str2;
        Object objM70193a;
        CharSequence charSequence;
        Map map2;
        CharSequence charSequence2;
        boolean zBooleanValue;
        C33050a c33050a;
        boolean z11;
        CharSequence charSequence3;
        C32414b c32414b;
        CharSequence charSequence4;
        Map map3;
        Object string;
        boolean z12;
        CharSequence charSequence5;
        CharSequence charSequence6;
        Object string2;
        CharSequence charSequence7;
        CharSequence charSequence8;
        Object string3;
        boolean z13;
        CharSequence charSequence9;
        CharSequence charSequence10;
        CharSequence charSequence11;
        Map map4;
        CharSequence charSequence12;
        c32403l.getClass();
        if (continuationImpl instanceof C32453v) {
            c32453v = (C32453v) continuationImpl;
            int i11 = c32453v.f66155i;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32453v.f66155i = i11 - Integer.MIN_VALUE;
            } else {
                c32453v = new C32453v(c32403l, continuationImpl);
            }
        } else {
            c32453v = new C32453v(c32403l, continuationImpl);
        }
        Object objM71121b = c32453v.f66153g;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c32453v.f66155i) {
            case 0:
                ResultKt.throwOnFailure(objM71121b);
                C29983l strings = c32403l.getStrings();
                C29124h config = c32403l.getConfig();
                C28890b c28890b2 = new C28890b(strings, config != null ? config.f59071d : null, "VIDEO_IDENT", null, IntroScene.VIDEO_IDENT.getSceneName(), true);
                c32453v.f66147a = c28890b2;
                c32453v.f66155i = 1;
                objM71121b = c32403l.m71121b(c32453v);
                if (objM71121b != coroutine_suspended) {
                    c28890b = c28890b2;
                    if (((Boolean) objM71121b).booleanValue()) {
                        c32453v.f66147a = c28890b;
                        c32453v.f66155i = 2;
                        objM71121b = c32403l.getString("sns_status_VIDEO_IDENT_footerHtml_noAgreement", c32453v);
                    } else {
                        str = null;
                        map = c28890b.f58739e;
                        obj = map.get("actionTitle");
                        if (obj instanceof String) {
                            str2 = (String) obj;
                        } else {
                            str2 = null;
                        }
                        C30336z c30336z = c32403l.f66044c;
                        c32453v.f66147a = map;
                        c32453v.f66148b = str;
                        c32453v.f66149c = str2;
                        c32453v.f66155i = 3;
                        objM70193a = c30336z.m70193a(c32453v);
                        if (objM70193a != coroutine_suspended) {
                            String str3 = str2;
                            charSequence = str;
                            objM71121b = objM70193a;
                            map2 = map;
                            charSequence2 = str3;
                            zBooleanValue = ((Boolean) objM71121b).booleanValue();
                            c33050a = C33048a.f67441D;
                            if (!c33050a.m71434a()) {
                                c33050a = null;
                            }
                            if (c33050a != null) {
                                c32453v.f66147a = map2;
                                c32453v.f66148b = charSequence;
                                c32453v.f66149c = charSequence2;
                                c32453v.f66152f = zBooleanValue;
                                c32453v.f66155i = 4;
                                string = c32403l.getString("sns_alert_aboutToExitVerification", c32453v);
                                if (string != coroutine_suspended) {
                                    CharSequence charSequence13 = charSequence2;
                                    z12 = zBooleanValue;
                                    objM71121b = string;
                                    charSequence5 = charSequence13;
                                    charSequence6 = (CharSequence) objM71121b;
                                    c32453v.f66147a = charSequence6;
                                    c32453v.f66148b = map2;
                                    c32453v.f66149c = charSequence;
                                    c32453v.f66150d = charSequence5;
                                    c32453v.f66152f = z12;
                                    c32453v.f66155i = 5;
                                    string2 = c32403l.getString("sns_alert_action_confirm", c32453v);
                                    if (string2 != coroutine_suspended) {
                                        charSequence7 = charSequence6;
                                        objM71121b = string2;
                                        charSequence8 = (CharSequence) objM71121b;
                                        c32453v.f66147a = charSequence7;
                                        c32453v.f66148b = charSequence8;
                                        c32453v.f66149c = map2;
                                        c32453v.f66150d = charSequence;
                                        c32453v.f66151e = charSequence5;
                                        c32453v.f66152f = z12;
                                        c32453v.f66155i = 6;
                                        string3 = c32403l.getString("sns_alert_action_cancel", c32453v);
                                        if (string3 != coroutine_suspended) {
                                            objM71121b = string3;
                                            z13 = z12;
                                            charSequence9 = charSequence;
                                            charSequence10 = charSequence8;
                                            charSequence11 = charSequence5;
                                            map4 = map2;
                                            charSequence12 = charSequence7;
                                            z11 = z13;
                                            charSequence3 = charSequence11;
                                            charSequence4 = charSequence9;
                                            map3 = map4;
                                            c32414b = new C32414b(charSequence12, charSequence10, (CharSequence) objM71121b);
                                        }
                                    }
                                }
                            } else {
                                z11 = zBooleanValue;
                                charSequence3 = charSequence2;
                                c32414b = null;
                                charSequence4 = charSequence;
                                map3 = map2;
                            }
                            return new C32409S(map3, charSequence4, charSequence3, z11, c32414b, SNSApplicantStatusAnalyticsState.VideoIdent);
                        }
                    }
                    break;
                }
                return coroutine_suspended;
            case 1:
                c28890b = (C28890b) c32453v.f66147a;
                ResultKt.throwOnFailure(objM71121b);
                if (((Boolean) objM71121b).booleanValue()) {
                    c32453v.f66147a = c28890b;
                    c32453v.f66155i = 2;
                    objM71121b = c32403l.getString("sns_status_VIDEO_IDENT_footerHtml_noAgreement", c32453v);
                    break;
                } else {
                    str = null;
                    map = c28890b.f58739e;
                    obj = map.get("actionTitle");
                    if (obj instanceof String) {
                        str2 = (String) obj;
                    } else {
                        str2 = null;
                    }
                    C30336z c30336z2 = c32403l.f66044c;
                    c32453v.f66147a = map;
                    c32453v.f66148b = str;
                    c32453v.f66149c = str2;
                    c32453v.f66155i = 3;
                    objM70193a = c30336z2.m70193a(c32453v);
                    if (objM70193a != coroutine_suspended) {
                        String str4 = str2;
                        charSequence = str;
                        objM71121b = objM70193a;
                        map2 = map;
                        charSequence2 = str4;
                        zBooleanValue = ((Boolean) objM71121b).booleanValue();
                        c33050a = C33048a.f67441D;
                        if (!c33050a.m71434a()) {
                            c33050a = null;
                        }
                        if (c33050a != null) {
                            c32453v.f66147a = map2;
                            c32453v.f66148b = charSequence;
                            c32453v.f66149c = charSequence2;
                            c32453v.f66152f = zBooleanValue;
                            c32453v.f66155i = 4;
                            string = c32403l.getString("sns_alert_aboutToExitVerification", c32453v);
                            if (string != coroutine_suspended) {
                                CharSequence charSequence14 = charSequence2;
                                z12 = zBooleanValue;
                                objM71121b = string;
                                charSequence5 = charSequence14;
                                charSequence6 = (CharSequence) objM71121b;
                                c32453v.f66147a = charSequence6;
                                c32453v.f66148b = map2;
                                c32453v.f66149c = charSequence;
                                c32453v.f66150d = charSequence5;
                                c32453v.f66152f = z12;
                                c32453v.f66155i = 5;
                                string2 = c32403l.getString("sns_alert_action_confirm", c32453v);
                                if (string2 != coroutine_suspended) {
                                    charSequence7 = charSequence6;
                                    objM71121b = string2;
                                    charSequence8 = (CharSequence) objM71121b;
                                    c32453v.f66147a = charSequence7;
                                    c32453v.f66148b = charSequence8;
                                    c32453v.f66149c = map2;
                                    c32453v.f66150d = charSequence;
                                    c32453v.f66151e = charSequence5;
                                    c32453v.f66152f = z12;
                                    c32453v.f66155i = 6;
                                    string3 = c32403l.getString("sns_alert_action_cancel", c32453v);
                                    if (string3 != coroutine_suspended) {
                                        objM71121b = string3;
                                        z13 = z12;
                                        charSequence9 = charSequence;
                                        charSequence10 = charSequence8;
                                        charSequence11 = charSequence5;
                                        map4 = map2;
                                        charSequence12 = charSequence7;
                                        z11 = z13;
                                        charSequence3 = charSequence11;
                                        charSequence4 = charSequence9;
                                        map3 = map4;
                                        c32414b = new C32414b(charSequence12, charSequence10, (CharSequence) objM71121b);
                                    }
                                }
                            }
                        } else {
                            z11 = zBooleanValue;
                            charSequence3 = charSequence2;
                            c32414b = null;
                            charSequence4 = charSequence;
                            map3 = map2;
                        }
                        return new C32409S(map3, charSequence4, charSequence3, z11, c32414b, SNSApplicantStatusAnalyticsState.VideoIdent);
                    }
                }
                return coroutine_suspended;
            case 2:
                c28890b = (C28890b) c32453v.f66147a;
                ResultKt.throwOnFailure(objM71121b);
                str = (String) objM71121b;
                map = c28890b.f58739e;
                obj = map.get("actionTitle");
                if (obj instanceof String) {
                    str2 = (String) obj;
                } else {
                    str2 = null;
                }
                C30336z c30336z3 = c32403l.f66044c;
                c32453v.f66147a = map;
                c32453v.f66148b = str;
                c32453v.f66149c = str2;
                c32453v.f66155i = 3;
                objM70193a = c30336z3.m70193a(c32453v);
                if (objM70193a != coroutine_suspended) {
                    String str5 = str2;
                    charSequence = str;
                    objM71121b = objM70193a;
                    map2 = map;
                    charSequence2 = str5;
                    zBooleanValue = ((Boolean) objM71121b).booleanValue();
                    c33050a = C33048a.f67441D;
                    if (!c33050a.m71434a()) {
                        c33050a = null;
                    }
                    if (c33050a != null) {
                        c32453v.f66147a = map2;
                        c32453v.f66148b = charSequence;
                        c32453v.f66149c = charSequence2;
                        c32453v.f66152f = zBooleanValue;
                        c32453v.f66155i = 4;
                        string = c32403l.getString("sns_alert_aboutToExitVerification", c32453v);
                        if (string != coroutine_suspended) {
                            CharSequence charSequence15 = charSequence2;
                            z12 = zBooleanValue;
                            objM71121b = string;
                            charSequence5 = charSequence15;
                            charSequence6 = (CharSequence) objM71121b;
                            c32453v.f66147a = charSequence6;
                            c32453v.f66148b = map2;
                            c32453v.f66149c = charSequence;
                            c32453v.f66150d = charSequence5;
                            c32453v.f66152f = z12;
                            c32453v.f66155i = 5;
                            string2 = c32403l.getString("sns_alert_action_confirm", c32453v);
                            if (string2 != coroutine_suspended) {
                                charSequence7 = charSequence6;
                                objM71121b = string2;
                                charSequence8 = (CharSequence) objM71121b;
                                c32453v.f66147a = charSequence7;
                                c32453v.f66148b = charSequence8;
                                c32453v.f66149c = map2;
                                c32453v.f66150d = charSequence;
                                c32453v.f66151e = charSequence5;
                                c32453v.f66152f = z12;
                                c32453v.f66155i = 6;
                                string3 = c32403l.getString("sns_alert_action_cancel", c32453v);
                                if (string3 != coroutine_suspended) {
                                    objM71121b = string3;
                                    z13 = z12;
                                    charSequence9 = charSequence;
                                    charSequence10 = charSequence8;
                                    charSequence11 = charSequence5;
                                    map4 = map2;
                                    charSequence12 = charSequence7;
                                    z11 = z13;
                                    charSequence3 = charSequence11;
                                    charSequence4 = charSequence9;
                                    map3 = map4;
                                    c32414b = new C32414b(charSequence12, charSequence10, (CharSequence) objM71121b);
                                }
                            }
                        }
                    } else {
                        z11 = zBooleanValue;
                        charSequence3 = charSequence2;
                        c32414b = null;
                        charSequence4 = charSequence;
                        map3 = map2;
                    }
                    return new C32409S(map3, charSequence4, charSequence3, z11, c32414b, SNSApplicantStatusAnalyticsState.VideoIdent);
                }
                return coroutine_suspended;
            case 3:
                charSequence2 = (CharSequence) c32453v.f66149c;
                charSequence = (CharSequence) c32453v.f66148b;
                map2 = (Map) c32453v.f66147a;
                ResultKt.throwOnFailure(objM71121b);
                zBooleanValue = ((Boolean) objM71121b).booleanValue();
                c33050a = C33048a.f67441D;
                if (!c33050a.m71434a()) {
                    c33050a = null;
                }
                if (c33050a != null) {
                    c32453v.f66147a = map2;
                    c32453v.f66148b = charSequence;
                    c32453v.f66149c = charSequence2;
                    c32453v.f66152f = zBooleanValue;
                    c32453v.f66155i = 4;
                    string = c32403l.getString("sns_alert_aboutToExitVerification", c32453v);
                    if (string != coroutine_suspended) {
                        CharSequence charSequence16 = charSequence2;
                        z12 = zBooleanValue;
                        objM71121b = string;
                        charSequence5 = charSequence16;
                        charSequence6 = (CharSequence) objM71121b;
                        c32453v.f66147a = charSequence6;
                        c32453v.f66148b = map2;
                        c32453v.f66149c = charSequence;
                        c32453v.f66150d = charSequence5;
                        c32453v.f66152f = z12;
                        c32453v.f66155i = 5;
                        string2 = c32403l.getString("sns_alert_action_confirm", c32453v);
                        if (string2 != coroutine_suspended) {
                            charSequence7 = charSequence6;
                            objM71121b = string2;
                            charSequence8 = (CharSequence) objM71121b;
                            c32453v.f66147a = charSequence7;
                            c32453v.f66148b = charSequence8;
                            c32453v.f66149c = map2;
                            c32453v.f66150d = charSequence;
                            c32453v.f66151e = charSequence5;
                            c32453v.f66152f = z12;
                            c32453v.f66155i = 6;
                            string3 = c32403l.getString("sns_alert_action_cancel", c32453v);
                            if (string3 != coroutine_suspended) {
                                objM71121b = string3;
                                z13 = z12;
                                charSequence9 = charSequence;
                                charSequence10 = charSequence8;
                                charSequence11 = charSequence5;
                                map4 = map2;
                                charSequence12 = charSequence7;
                                z11 = z13;
                                charSequence3 = charSequence11;
                                charSequence4 = charSequence9;
                                map3 = map4;
                                c32414b = new C32414b(charSequence12, charSequence10, (CharSequence) objM71121b);
                            }
                        }
                    }
                    return coroutine_suspended;
                }
                z11 = zBooleanValue;
                charSequence3 = charSequence2;
                c32414b = null;
                charSequence4 = charSequence;
                map3 = map2;
                return new C32409S(map3, charSequence4, charSequence3, z11, c32414b, SNSApplicantStatusAnalyticsState.VideoIdent);
            case 4:
                z12 = c32453v.f66152f;
                charSequence5 = (CharSequence) c32453v.f66149c;
                charSequence = (CharSequence) c32453v.f66148b;
                map2 = (Map) c32453v.f66147a;
                ResultKt.throwOnFailure(objM71121b);
                charSequence6 = (CharSequence) objM71121b;
                c32453v.f66147a = charSequence6;
                c32453v.f66148b = map2;
                c32453v.f66149c = charSequence;
                c32453v.f66150d = charSequence5;
                c32453v.f66152f = z12;
                c32453v.f66155i = 5;
                string2 = c32403l.getString("sns_alert_action_confirm", c32453v);
                if (string2 != coroutine_suspended) {
                    charSequence7 = charSequence6;
                    objM71121b = string2;
                    charSequence8 = (CharSequence) objM71121b;
                    c32453v.f66147a = charSequence7;
                    c32453v.f66148b = charSequence8;
                    c32453v.f66149c = map2;
                    c32453v.f66150d = charSequence;
                    c32453v.f66151e = charSequence5;
                    c32453v.f66152f = z12;
                    c32453v.f66155i = 6;
                    string3 = c32403l.getString("sns_alert_action_cancel", c32453v);
                    if (string3 != coroutine_suspended) {
                        objM71121b = string3;
                        z13 = z12;
                        charSequence9 = charSequence;
                        charSequence10 = charSequence8;
                        charSequence11 = charSequence5;
                        map4 = map2;
                        charSequence12 = charSequence7;
                        z11 = z13;
                        charSequence3 = charSequence11;
                        charSequence4 = charSequence9;
                        map3 = map4;
                        c32414b = new C32414b(charSequence12, charSequence10, (CharSequence) objM71121b);
                        return new C32409S(map3, charSequence4, charSequence3, z11, c32414b, SNSApplicantStatusAnalyticsState.VideoIdent);
                    }
                }
                return coroutine_suspended;
            case 5:
                z12 = c32453v.f66152f;
                charSequence5 = c32453v.f66150d;
                charSequence = (CharSequence) c32453v.f66149c;
                map2 = (Map) c32453v.f66148b;
                charSequence7 = (CharSequence) c32453v.f66147a;
                ResultKt.throwOnFailure(objM71121b);
                charSequence8 = (CharSequence) objM71121b;
                c32453v.f66147a = charSequence7;
                c32453v.f66148b = charSequence8;
                c32453v.f66149c = map2;
                c32453v.f66150d = charSequence;
                c32453v.f66151e = charSequence5;
                c32453v.f66152f = z12;
                c32453v.f66155i = 6;
                string3 = c32403l.getString("sns_alert_action_cancel", c32453v);
                if (string3 != coroutine_suspended) {
                    objM71121b = string3;
                    z13 = z12;
                    charSequence9 = charSequence;
                    charSequence10 = charSequence8;
                    charSequence11 = charSequence5;
                    map4 = map2;
                    charSequence12 = charSequence7;
                    z11 = z13;
                    charSequence3 = charSequence11;
                    charSequence4 = charSequence9;
                    map3 = map4;
                    c32414b = new C32414b(charSequence12, charSequence10, (CharSequence) objM71121b);
                    return new C32409S(map3, charSequence4, charSequence3, z11, c32414b, SNSApplicantStatusAnalyticsState.VideoIdent);
                }
                return coroutine_suspended;
            case 6:
                z13 = c32453v.f66152f;
                charSequence11 = c32453v.f66151e;
                charSequence9 = c32453v.f66150d;
                map4 = (Map) c32453v.f66149c;
                charSequence10 = (CharSequence) c32453v.f66148b;
                charSequence12 = (CharSequence) c32453v.f66147a;
                ResultKt.throwOnFailure(objM71121b);
                z11 = z13;
                charSequence3 = charSequence11;
                charSequence4 = charSequence9;
                map3 = map4;
                c32414b = new C32414b(charSequence12, charSequence10, (CharSequence) objM71121b);
                return new C32409S(map3, charSequence4, charSequence3, z11, c32414b, SNSApplicantStatusAnalyticsState.VideoIdent);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:103:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:107:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:108:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:114:0x013e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:115:? A[LOOP:0: B:60:0x012c->B:115:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:117:0x015d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:118:? A[LOOP:1: B:69:0x014b->B:118:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x017c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:121:? A[LOOP:2: B:78:0x016a->B:121:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:123:0x01c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:124:? A[LOOP:3: B:101:0x01ae->B:124:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00db  */
    /* JADX WARN: Code duplicated, block: B:49:0x0109 A[PHI: r1 r2 r3 r4 r8 r12 r14
      0x0109: PHI (r1v1 com.sumsub.sns.internal.features.data.model.common.h) = 
      (r1v0 com.sumsub.sns.internal.features.data.model.common.h)
      (r1v17 com.sumsub.sns.internal.features.data.model.common.h)
     binds: [B:41:0x00e0, B:46:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r2v1 com.sumsub.sns.internal.features.data.model.common.p) = 
      (r2v0 com.sumsub.sns.internal.features.data.model.common.p)
      (r2v3 com.sumsub.sns.internal.features.data.model.common.p)
     binds: [B:41:0x00e0, B:46:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r3v1 java.util.List) = (r3v0 java.util.List), (r3v21 java.util.List) binds: [B:41:0x00e0, B:46:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r4v4 com.sumsub.sns.internal.features.data.model.common.ReviewStatusType) = 
      (r4v2 com.sumsub.sns.internal.features.data.model.common.ReviewStatusType)
      (r4v11 com.sumsub.sns.internal.features.data.model.common.ReviewStatusType)
     binds: [B:41:0x00e0, B:46:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r8v9 com.sumsub.sns.internal.features.data.model.common.ReviewStatusType) = 
      (r8v8 com.sumsub.sns.internal.features.data.model.common.ReviewStatusType)
      (r8v11 com.sumsub.sns.internal.features.data.model.common.ReviewStatusType)
     binds: [B:41:0x00e0, B:46:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r12v8 int) = (r12v6 int), (r12v11 int) binds: [B:41:0x00e0, B:46:0x00ff] A[DONT_GENERATE, DONT_INLINE]
      0x0109: PHI (r14v4 int) = (r14v3 int), (r14v7 int) binds: [B:41:0x00e0, B:46:0x00ff] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0117  */
    /* JADX WARN: Code duplicated, block: B:55:0x011f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:56:0x0121  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x0132  */
    /* JADX WARN: Code duplicated, block: B:65:0x0140  */
    /* JADX WARN: Code duplicated, block: B:68:0x0147  */
    /* JADX WARN: Code duplicated, block: B:71:0x0151  */
    /* JADX WARN: Code duplicated, block: B:74:0x015f  */
    /* JADX WARN: Code duplicated, block: B:77:0x0166  */
    /* JADX WARN: Code duplicated, block: B:7:0x001f  */
    /* JADX WARN: Code duplicated, block: B:80:0x0170  */
    /* JADX WARN: Code duplicated, block: B:83:0x017f  */
    /* JADX WARN: Code duplicated, block: B:85:0x0185  */
    /* JADX WARN: Code duplicated, block: B:87:0x0189  */
    /* JADX WARN: Code duplicated, block: B:88:0x018c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0190  */
    /* JADX WARN: Code duplicated, block: B:91:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0195  */
    /* JADX WARN: Code duplicated, block: B:94:0x019b  */
    /* JADX WARN: Code duplicated, block: B:95:0x019e  */
    /* JADX WARN: Code duplicated, block: B:96:0x01a1  */
    /* JADX INFO: renamed from: b */
    public final Object m71120b(C29124h c29124h, AbstractC29172p abstractC29172p, List list, C28984B3 c28984b3, ContinuationImpl continuationImpl) {
        C32394C c32394c;
        ReviewStatusType reviewStatusType;
        ReviewStatusType reviewStatusType2;
        int i11;
        int i12;
        ApplicantStatus applicantStatus;
        int i13;
        List list2;
        Iterator it;
        Iterator it2;
        Iterator it3;
        Iterator it4;
        C29124h c29124h2 = c29124h;
        AbstractC29172p abstractC29172p2 = abstractC29172p;
        List list3 = list;
        if (continuationImpl instanceof C32394C) {
            c32394c = (C32394C) continuationImpl;
            int i14 = c32394c.f65998j;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                c32394c.f65998j = i14 - Integer.MIN_VALUE;
            } else {
                c32394c = new C32394C(this, continuationImpl);
            }
        } else {
            c32394c = new C32394C(this, continuationImpl);
        }
        Object objM71119a = c32394c.f65996h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i15 = c32394c.f65998j;
        if (i15 == 0) {
            ResultKt.throwOnFailure(objM71119a);
            if (c29124h2 == null || abstractC29172p2 == null || list3 == null || list3.isEmpty()) {
                return null;
            }
            C29164n3 c29164n3 = abstractC29172p2.mo69762m().f59168e;
            String str = "On Load Data Success for applicant: " + abstractC29172p2.mo69754e();
            C33270a c33270a = C33272c.f67816e;
            c33270a.f67810a.mo68955d("SNSApplicantStatusViewModel", str, null);
            c33270a.f67810a.mo68955d("SNSApplicantStatusViewModel", "Review status: " + abstractC29172p2.mo69762m().f59165b + " result=" + c29164n3, null);
            reviewStatusType = abstractC29172p2.mo69762m().f59165b;
            reviewStatusType2 = c28984b3 != null ? c28984b3.f58905a : null;
            i11 = abstractC29172p2.mo69762m().f59165b == ReviewStatusType.Init ? 1 : 0;
            if ((c29164n3 != null ? c29164n3.f59161c : null) != ReviewAnswerType.Green) {
                i12 = (c29164n3 != null ? c29164n3.f59163e : null) == ReviewRejectType.Final ? 1 : 0;
            }
            if (AbstractC29130i.m69777c(c29124h2)) {
                c32394c.f65989a = c29124h2;
                c32394c.f65990b = abstractC29172p2;
                c32394c.f65991c = list3;
                c32394c.f65992d = reviewStatusType;
                c32394c.f65993e = reviewStatusType2;
                c32394c.f65994f = i11;
                c32394c.f65995g = i12;
                c32394c.f65998j = 1;
                objM71119a = m71119a(c32394c);
                if (objM71119a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                applicantStatus = ApplicantStatus.Reviewing;
            }
            i13 = i11;
            list2 = list3;
            switch (AbstractC32448s.f66139b[reviewStatusType.ordinal()]) {
                case 1:
                    if (i12 != 0) {
                        if (list2 == null || !list2.isEmpty()) {
                            it = list2.iterator();
                            while (it.hasNext()) {
                                if (!((Document) it.next()).isReviewing()) {
                                    if (!AbstractC29130i.m69779e(c29124h2)) {
                                        applicantStatus = ApplicantStatus.Reviewed;
                                    } else {
                                        applicantStatus = ApplicantStatus.Skip;
                                    }
                                    break;
                                }
                            }
                            applicantStatus = ApplicantStatus.Reviewing;
                        } else {
                            applicantStatus = ApplicantStatus.Reviewing;
                        }
                    } else if (AbstractC29130i.m69775b(c29124h2)) {
                        applicantStatus = ApplicantStatus.Reviewed;
                    } else {
                        applicantStatus = ApplicantStatus.Skip;
                    }
                    break;
                case 2:
                case 3:
                case 4:
                    if (reviewStatusType2 == ReviewStatusType.Processing) {
                        applicantStatus = ApplicantStatus.Submitting;
                    }
                    break;
                case 5:
                    if (reviewStatusType2 == ReviewStatusType.Pending) {
                        applicantStatus = ApplicantStatus.Submitting;
                    }
                    break;
                case 6:
                    break;
                default:
                    if (i13 != 0 && reviewStatusType2 != null) {
                        applicantStatus = ApplicantStatus.Submitting;
                    } else if (list2 == null && list2.isEmpty()) {
                        applicantStatus = ApplicantStatus.None;
                    } else {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((Document) it2.next()).isSubmitted()) {
                                if (list2 == null && list2.isEmpty()) {
                                    applicantStatus = ApplicantStatus.Reviewing;
                                } else {
                                    it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        if (!((Document) it3.next()).isSubmitted()) {
                                            if (list2 == null && list2.isEmpty()) {
                                                applicantStatus = ApplicantStatus.Reviewing;
                                            } else {
                                                it4 = list2.iterator();
                                                while (it4.hasNext()) {
                                                    if (((Document) it4.next()).isSubmitted()) {
                                                        applicantStatus = ApplicantStatus.Submitting;
                                                        break;
                                                    }
                                                }
                                                applicantStatus = ApplicantStatus.Reviewing;
                                            }
                                            break;
                                        }
                                    }
                                    applicantStatus = ApplicantStatus.Reviewing;
                                }
                                break;
                            }
                        }
                        applicantStatus = ApplicantStatus.None;
                    }
                    break;
            }
            C33272c.f67816e.f67810a.mo68955d("SNSApplicantStatusViewModel", "Show screen for the following documents: " + CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.status.b0
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C32403L.m71112a((Document) obj);
                }
            }, 31, null) + ". Status: " + applicantStatus.name(), null);
            return new C28879c(applicantStatus, abstractC29172p2, list2);
        }
        if (i15 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        int i16 = c32394c.f65995g;
        int i17 = c32394c.f65994f;
        ReviewStatusType reviewStatusType3 = c32394c.f65993e;
        ReviewStatusType reviewStatusType4 = c32394c.f65992d;
        List list4 = c32394c.f65991c;
        AbstractC29172p abstractC29172p3 = c32394c.f65990b;
        C29124h c29124h3 = c32394c.f65989a;
        ResultKt.throwOnFailure(objM71119a);
        i12 = i16;
        i11 = i17;
        c29124h2 = c29124h3;
        abstractC29172p2 = abstractC29172p3;
        reviewStatusType = reviewStatusType4;
        reviewStatusType2 = reviewStatusType3;
        list3 = list4;
        if (((Boolean) objM71119a).booleanValue()) {
            applicantStatus = ApplicantStatus.Reviewing;
        } else {
            applicantStatus = ApplicantStatus.Skip;
        }
        i13 = i11;
        list2 = list3;
        switch (AbstractC32448s.f66139b[reviewStatusType.ordinal()]) {
            case 1:
                if (i12 != 0) {
                    if (list2 == null) {
                        it = list2.iterator();
                        while (it.hasNext()) {
                            if (!((Document) it.next()).isReviewing()) {
                                if (!AbstractC29130i.m69779e(c29124h2)) {
                                    applicantStatus = ApplicantStatus.Reviewed;
                                } else {
                                    applicantStatus = ApplicantStatus.Skip;
                                }
                                break;
                            }
                        }
                        applicantStatus = ApplicantStatus.Reviewing;
                    } else {
                        it = list2.iterator();
                        while (it.hasNext()) {
                            if (!((Document) it.next()).isReviewing()) {
                                if (!AbstractC29130i.m69779e(c29124h2)) {
                                    applicantStatus = ApplicantStatus.Reviewed;
                                } else {
                                    applicantStatus = ApplicantStatus.Skip;
                                }
                                break;
                            }
                        }
                        applicantStatus = ApplicantStatus.Reviewing;
                    }
                } else if (AbstractC29130i.m69775b(c29124h2)) {
                    applicantStatus = ApplicantStatus.Reviewed;
                } else {
                    applicantStatus = ApplicantStatus.Skip;
                }
                break;
            case 2:
            case 3:
            case 4:
                if (reviewStatusType2 == ReviewStatusType.Processing) {
                    applicantStatus = ApplicantStatus.Submitting;
                }
                break;
            case 5:
                if (reviewStatusType2 == ReviewStatusType.Pending) {
                    applicantStatus = ApplicantStatus.Submitting;
                }
                break;
            case 6:
                break;
            default:
                if (i13 != 0) {
                    if (list2 == null) {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((Document) it2.next()).isSubmitted()) {
                                if (list2 == null) {
                                    it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        if (!((Document) it3.next()).isSubmitted()) {
                                            if (list2 == null) {
                                                it4 = list2.iterator();
                                                while (it4.hasNext()) {
                                                    if (((Document) it4.next()).isSubmitted()) {
                                                        applicantStatus = ApplicantStatus.Submitting;
                                                        break;
                                                    }
                                                }
                                                applicantStatus = ApplicantStatus.Reviewing;
                                            } else {
                                                it4 = list2.iterator();
                                                while (it4.hasNext()) {
                                                    if (((Document) it4.next()).isSubmitted()) {
                                                        applicantStatus = ApplicantStatus.Submitting;
                                                        break;
                                                    }
                                                }
                                                applicantStatus = ApplicantStatus.Reviewing;
                                            }
                                            break;
                                        }
                                    }
                                    applicantStatus = ApplicantStatus.Reviewing;
                                } else {
                                    it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        if (!((Document) it3.next()).isSubmitted()) {
                                            if (list2 == null) {
                                                it4 = list2.iterator();
                                                while (it4.hasNext()) {
                                                    if (((Document) it4.next()).isSubmitted()) {
                                                        applicantStatus = ApplicantStatus.Submitting;
                                                        break;
                                                    }
                                                }
                                                applicantStatus = ApplicantStatus.Reviewing;
                                            } else {
                                                it4 = list2.iterator();
                                                while (it4.hasNext()) {
                                                    if (((Document) it4.next()).isSubmitted()) {
                                                        applicantStatus = ApplicantStatus.Submitting;
                                                        break;
                                                    }
                                                }
                                                applicantStatus = ApplicantStatus.Reviewing;
                                            }
                                            break;
                                        }
                                    }
                                    applicantStatus = ApplicantStatus.Reviewing;
                                }
                                break;
                            }
                        }
                        applicantStatus = ApplicantStatus.None;
                    } else {
                        it2 = list2.iterator();
                        while (it2.hasNext()) {
                            if (((Document) it2.next()).isSubmitted()) {
                                if (list2 == null) {
                                    it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        if (!((Document) it3.next()).isSubmitted()) {
                                            if (list2 == null) {
                                                it4 = list2.iterator();
                                                while (it4.hasNext()) {
                                                    if (((Document) it4.next()).isSubmitted()) {
                                                        applicantStatus = ApplicantStatus.Submitting;
                                                        break;
                                                    }
                                                }
                                                applicantStatus = ApplicantStatus.Reviewing;
                                            } else {
                                                it4 = list2.iterator();
                                                while (it4.hasNext()) {
                                                    if (((Document) it4.next()).isSubmitted()) {
                                                        applicantStatus = ApplicantStatus.Submitting;
                                                        break;
                                                    }
                                                }
                                                applicantStatus = ApplicantStatus.Reviewing;
                                            }
                                            break;
                                        }
                                    }
                                    applicantStatus = ApplicantStatus.Reviewing;
                                } else {
                                    it3 = list2.iterator();
                                    while (it3.hasNext()) {
                                        if (!((Document) it3.next()).isSubmitted()) {
                                            if (list2 == null) {
                                                it4 = list2.iterator();
                                                while (it4.hasNext()) {
                                                    if (((Document) it4.next()).isSubmitted()) {
                                                        applicantStatus = ApplicantStatus.Submitting;
                                                        break;
                                                    }
                                                }
                                                applicantStatus = ApplicantStatus.Reviewing;
                                            } else {
                                                it4 = list2.iterator();
                                                while (it4.hasNext()) {
                                                    if (((Document) it4.next()).isSubmitted()) {
                                                        applicantStatus = ApplicantStatus.Submitting;
                                                        break;
                                                    }
                                                }
                                                applicantStatus = ApplicantStatus.Reviewing;
                                            }
                                            break;
                                        }
                                    }
                                    applicantStatus = ApplicantStatus.Reviewing;
                                }
                                break;
                            }
                        }
                        applicantStatus = ApplicantStatus.None;
                    }
                } else if (list2 == null) {
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((Document) it2.next()).isSubmitted()) {
                            if (list2 == null) {
                                it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    if (!((Document) it3.next()).isSubmitted()) {
                                        if (list2 == null) {
                                            it4 = list2.iterator();
                                            while (it4.hasNext()) {
                                                if (((Document) it4.next()).isSubmitted()) {
                                                    applicantStatus = ApplicantStatus.Submitting;
                                                    break;
                                                }
                                            }
                                            applicantStatus = ApplicantStatus.Reviewing;
                                        } else {
                                            it4 = list2.iterator();
                                            while (it4.hasNext()) {
                                                if (((Document) it4.next()).isSubmitted()) {
                                                    applicantStatus = ApplicantStatus.Submitting;
                                                    break;
                                                }
                                            }
                                            applicantStatus = ApplicantStatus.Reviewing;
                                        }
                                        break;
                                    }
                                }
                                applicantStatus = ApplicantStatus.Reviewing;
                            } else {
                                it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    if (!((Document) it3.next()).isSubmitted()) {
                                        if (list2 == null) {
                                            it4 = list2.iterator();
                                            while (it4.hasNext()) {
                                                if (((Document) it4.next()).isSubmitted()) {
                                                    applicantStatus = ApplicantStatus.Submitting;
                                                    break;
                                                }
                                            }
                                            applicantStatus = ApplicantStatus.Reviewing;
                                        } else {
                                            it4 = list2.iterator();
                                            while (it4.hasNext()) {
                                                if (((Document) it4.next()).isSubmitted()) {
                                                    applicantStatus = ApplicantStatus.Submitting;
                                                    break;
                                                }
                                            }
                                            applicantStatus = ApplicantStatus.Reviewing;
                                        }
                                        break;
                                    }
                                }
                                applicantStatus = ApplicantStatus.Reviewing;
                            }
                            break;
                        }
                    }
                    applicantStatus = ApplicantStatus.None;
                } else {
                    it2 = list2.iterator();
                    while (it2.hasNext()) {
                        if (((Document) it2.next()).isSubmitted()) {
                            if (list2 == null) {
                                it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    if (!((Document) it3.next()).isSubmitted()) {
                                        if (list2 == null) {
                                            it4 = list2.iterator();
                                            while (it4.hasNext()) {
                                                if (((Document) it4.next()).isSubmitted()) {
                                                    applicantStatus = ApplicantStatus.Submitting;
                                                    break;
                                                }
                                            }
                                            applicantStatus = ApplicantStatus.Reviewing;
                                        } else {
                                            it4 = list2.iterator();
                                            while (it4.hasNext()) {
                                                if (((Document) it4.next()).isSubmitted()) {
                                                    applicantStatus = ApplicantStatus.Submitting;
                                                    break;
                                                }
                                            }
                                            applicantStatus = ApplicantStatus.Reviewing;
                                        }
                                        break;
                                    }
                                }
                                applicantStatus = ApplicantStatus.Reviewing;
                            } else {
                                it3 = list2.iterator();
                                while (it3.hasNext()) {
                                    if (!((Document) it3.next()).isSubmitted()) {
                                        if (list2 == null) {
                                            it4 = list2.iterator();
                                            while (it4.hasNext()) {
                                                if (((Document) it4.next()).isSubmitted()) {
                                                    applicantStatus = ApplicantStatus.Submitting;
                                                    break;
                                                }
                                            }
                                            applicantStatus = ApplicantStatus.Reviewing;
                                        } else {
                                            it4 = list2.iterator();
                                            while (it4.hasNext()) {
                                                if (((Document) it4.next()).isSubmitted()) {
                                                    applicantStatus = ApplicantStatus.Submitting;
                                                    break;
                                                }
                                            }
                                            applicantStatus = ApplicantStatus.Reviewing;
                                        }
                                        break;
                                    }
                                }
                                applicantStatus = ApplicantStatus.Reviewing;
                            }
                            break;
                        }
                    }
                    applicantStatus = ApplicantStatus.None;
                }
                break;
        }
        C33272c.f67816e.f67810a.mo68955d("SNSApplicantStatusViewModel", "Show screen for the following documents: " + CollectionsKt.joinToString$default(list2, null, null, null, 0, null, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.status.b0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32403L.m71112a((Document) obj);
            }
        }, 31, null) + ". Status: " + applicantStatus.name(), null);
        return new C28879c(applicantStatus, abstractC29172p2, list2);
    }

    /* JADX INFO: renamed from: e */
    public final void m71123e() {
        AbstractC29172p abstractC29172p = this.f66051j;
        if (abstractC29172p == null) {
            C33272c.f67816e.f67810a.mo68956e("SNSApplicantStatusViewModel", "onContinueClicked: applicant is null", null);
            return;
        }
        C32641a c32641a = C32649e.f66642b;
        if (C32641a.m71261a(abstractC29172p)) {
            m71124f();
        } else {
            C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C32396E(this, null), 3, null);
        }
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28073M0
    public final InterfaceC28147s getDefaultState() {
        return C32406O.f66058h;
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final String getDocumentType() {
        return "Status";
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onDetach() {
        C33272c.f67816e.f67810a.mo68955d("SNSApplicantStatusViewModel", "Stop listening data", null);
        InterfaceC41775x1 interfaceC41775x1 = this.f66054m;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
    }

    public C32403L(InterfaceC29953a interfaceC29953a, C30088W c30088w, C30336z c30336z, InterfaceC29984m interfaceC29984m, InterfaceC29921d interfaceC29921d, C28547d c28547d, SavedStateHandle savedStateHandle, C31288j2 c31288j2) {
        boolean z11;
        C29713w3 c29713w3;
        super(interfaceC29953a, interfaceC29984m);
        this.f66042a = interfaceC29953a;
        this.f66043b = c30088w;
        this.f66044c = c30336z;
        this.f66045d = interfaceC29984m;
        this.f66046e = interfaceC29921d;
        this.f66047f = c28547d;
        this.f66048g = new C32649e(c28547d);
        this.f66049h = C41636g.m90888L(getViewState(), c31288j2.f63401b, new C32402K(null));
        this.f66050i = C41636g.m90881E(C41636g.m90888L(getViewState(), c31288j2.f63401b, new C32452u(null)));
        if (C33048a.f67465a0.m71434a()) {
            z11 = false;
        } else {
            C29124h c29124hM70039a = ((C29967J) interfaceC29984m).m70039a();
            if (c29124hM70039a != null && (c29713w3 = c29124hM70039a.f59080m) != null) {
                z11 = c29713w3.f59778b;
            } else {
                z11 = true;
            }
        }
        this.f66055n = new C28936t(savedStateHandle, "sumsub_id_status", Boolean.valueOf(z11), false);
    }

    /* JADX INFO: renamed from: f */
    public final void m71124f() {
        C29124h config;
        C29713w3 c29713w3;
        if (currentState() instanceof C32409S) {
            fireEvent(C32442p.f66131a);
            return;
        }
        if (((AbstractC32410T) currentState()).f66071g != null) {
            C28936t c28936t = this.f66055n;
            KProperty kProperty = f66041o[0];
            if (((Boolean) c28936t.m69705a()).booleanValue() && (config = getConfig()) != null && (c29713w3 = config.f59080m) != null && c29713w3.f59777a == SumsubIdType.INTRUSIVE) {
                fireEvent(C32440o.f66129a);
                return;
            }
        }
        ApplicantStatus applicantStatus = this.f66053l;
        if (applicantStatus == null) {
            return;
        }
        if (applicantStatus == ApplicantStatus.Submitting) {
            AbstractC28052C.finish$default(this, new C28494t(), null, null, null, 14, null);
            return;
        }
        SNSEventHandler eventHandler = C28468k0.f57983a.getEventHandler();
        if (eventHandler != null) {
            eventHandler.onEvent(SNSEvent.UserStartedVerification.INSTANCE);
        }
        AbstractC28052C.finish$default(this, new C28494t(), null, null, null, 14, null);
    }

    @Override // com.sumsub.sns.core.presentation.base.AbstractC28052C
    public final void onAttach() {
        super.onAttach();
        C33272c.f67816e.f67810a.mo68955d("SNSApplicantStatusViewModel", "Start listening data", null);
        InterfaceC41775x1 interfaceC41775x1 = this.f66054m;
        if (interfaceC41775x1 != null) {
            InterfaceC41775x1.a.m91377a(interfaceC41775x1, null, 1, null);
        }
        this.f66054m = AbstractC28421U.m69306b(((C29967J) this.f66045d).f60201i, ViewModelKt.getViewModelScope(this), new C32457z(this, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0102, code lost:
    
        if (m71116a(r1, r5) == r6) goto L50;
     */
    /* JADX INFO: renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m71117a(C29124h c29124h, AbstractC29172p abstractC29172p, List list, C28984B3 c28984b3, ContinuationImpl continuationImpl) {
        C32454w c32454w;
        AbstractC29172p abstractC29172p2;
        List list2;
        if (continuationImpl instanceof C32454w) {
            c32454w = (C32454w) continuationImpl;
            int i11 = c32454w.f66160e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32454w.f66160e = i11 - Integer.MIN_VALUE;
            } else {
                c32454w = new C32454w(this, continuationImpl);
            }
        } else {
            c32454w = new C32454w(this, continuationImpl);
        }
        Object objM71120b = c32454w.f66158c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32454w.f66160e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM71120b);
            if (list != null && abstractC29172p != null) {
                SNSSDKState sNSSDKStateM69729a = AbstractC29007H.m69729a(abstractC29172p, list, c28984b3 != null ? c28984b3.f58905a : null);
                if (sNSSDKStateM69729a != null) {
                    ((C29957e) this.f66042a).m70036a(sNSSDKStateM69729a);
                }
            }
            if (list != null && list.isEmpty()) {
                IllegalStateException illegalStateException = new IllegalStateException("No documents");
                C33272c.f67816e.f67810a.mo68956e("SNSApplicantStatusViewModel", "Error when getting data...", illegalStateException);
                AbstractC28052C.throwError$default(this, illegalStateException, "TYPE_UNKNOWN", null, 4, null);
                return Unit.INSTANCE;
            }
            c32454w.f66156a = abstractC29172p;
            c32454w.f66157b = list;
            c32454w.f66160e = 1;
            objM71120b = m71120b(c29124h, abstractC29172p, list, c28984b3, c32454w);
            if (objM71120b != coroutine_suspended) {
                abstractC29172p2 = abstractC29172p;
                list2 = list;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            list2 = c32454w.f66157b;
            abstractC29172p2 = (AbstractC29172p) c32454w.f66156a;
            ResultKt.throwOnFailure(objM71120b);
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM71120b);
        }
        return Unit.INSTANCE;
        C28879c c28879c = (C28879c) objM71120b;
        if (c28879c != null) {
            this.f66051j = abstractC29172p2;
            this.f66052k = list2;
            ApplicantStatus applicantStatus = c28879c.f58721a;
            this.f66053l = applicantStatus;
            C33272c.f67816e.f67810a.mo68955d("SNSApplicantStatusViewModel", "showApplicantStatus status=" + applicantStatus + " docs=" + c28879c.f58723c, null);
            int i13 = AbstractC32448s.f66138a[c28879c.f58721a.ordinal()];
            if (i13 == 1) {
                showProgress(false);
                AbstractC28073M0.updateState$default(this, false, new C32397F(c28879c, this, null), 1, null);
            } else if (i13 == 2) {
                showProgress(false);
                AbstractC28073M0.updateState$default(this, false, new C32401J(c28879c, this, null), 1, null);
            } else if (i13 == 3) {
                showProgress(false);
                AbstractC28073M0.updateState$default(this, false, new C32400I(c28879c, this, null), 1, null);
            } else if (i13 == 4) {
                c32454w.f66156a = c28879c;
                c32454w.f66157b = null;
                c32454w.f66160e = 2;
            } else if (i13 == 5) {
                AbstractC28052C.finish$default(this, new C28500v(), null, null, null, 14, null);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static final CharSequence m71112a(Document document) {
        return document.getType().f59014a;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x0087  */
    /* JADX WARN: Code duplicated, block: B:35:0x008f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0094  */
    /* JADX WARN: Code duplicated, block: B:40:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: b */
    public final Object m71121b(ContinuationImpl continuationImpl) {
        C32392A c32392a;
        C29124h c29124h;
        AbstractC29172p abstractC29172p;
        Object strings;
        AbstractC29172p abstractC29172p2;
        C29124h c29124h2;
        List list;
        if (continuationImpl instanceof C32392A) {
            c32392a = (C32392A) continuationImpl;
            int i11 = c32392a.f65985e;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32392a.f65985e = i11 - Integer.MIN_VALUE;
            } else {
                c32392a = new C32392A(this, continuationImpl);
            }
        } else {
            c32392a = new C32392A(this, continuationImpl);
        }
        Object objM70045b = c32392a.f65983c;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32392a.f65985e;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70045b);
            InterfaceC29984m interfaceC29984m = this.f66045d;
            c32392a.f65985e = 1;
            objM70045b = ((C29967J) interfaceC29984m).m70045b(false, c32392a);
            if (objM70045b != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            ResultKt.throwOnFailure(objM70045b);
        } else {
            if (i12 == 2) {
                c29124h = c32392a.f65981a;
                ResultKt.throwOnFailure(objM70045b);
                abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70045b).m70051c();
                if (abstractC29172p == null) {
                    return Boxing.boxBoolean(false);
                }
                C32641a c32641a = C32649e.f66642b;
                if (C32641a.m71261a(abstractC29172p)) {
                    return Boxing.boxBoolean(false);
                }
                c32392a.f65981a = c29124h;
                c32392a.f65982b = abstractC29172p;
                c32392a.f65985e = 3;
                strings = getStrings(c32392a);
                if (strings != coroutine_suspended) {
                    abstractC29172p2 = abstractC29172p;
                    objM70045b = strings;
                    c29124h2 = c29124h;
                }
                return coroutine_suspended;
            }
            if (i12 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            abstractC29172p2 = c32392a.f65982b;
            c29124h2 = c32392a.f65981a;
            ResultKt.throwOnFailure(objM70045b);
        }
        list = ((C29983l) objM70045b).f60249b;
        if (list == null && !list.isEmpty()) {
            C32641a c32641a2 = C32649e.f66642b;
            return Boxing.boxBoolean(!C32641a.m71260a(c29124h2, abstractC29172p2, list));
        }
        return Boxing.boxBoolean(false);
        C29124h c29124h3 = (C29124h) ((AbstractC29971N) objM70045b).m70051c();
        if (c29124h3 == null) {
            return Boxing.boxBoolean(false);
        }
        InterfaceC29984m interfaceC29984m2 = this.f66045d;
        c32392a.f65981a = c29124h3;
        c32392a.f65985e = 2;
        Object objM70042a = ((C29967J) interfaceC29984m2).m70042a(false, (Continuation) c32392a);
        if (objM70042a != coroutine_suspended) {
            c29124h = c29124h3;
            objM70045b = objM70042a;
            abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70045b).m70051c();
            if (abstractC29172p == null) {
                return Boxing.boxBoolean(false);
            }
            C32641a c32641a3 = C32649e.f66642b;
            if (C32641a.m71261a(abstractC29172p)) {
                return Boxing.boxBoolean(false);
            }
            c32392a.f65981a = c29124h;
            c32392a.f65982b = abstractC29172p;
            c32392a.f65985e = 3;
            strings = getStrings(c32392a);
            if (strings != coroutine_suspended) {
                abstractC29172p2 = abstractC29172p;
                objM70045b = strings;
                c29124h2 = c29124h;
                list = ((C29983l) objM70045b).f60249b;
                if (list == null) {
                }
                return Boxing.boxBoolean(false);
            }
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71119a(ContinuationImpl continuationImpl) {
        C32456y c32456y;
        C29140j3 c29140j3Mo69761l;
        C28994D3 c28994d3;
        if (continuationImpl instanceof C32456y) {
            c32456y = (C32456y) continuationImpl;
            int i11 = c32456y.f66169c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32456y.f66169c = i11 - Integer.MIN_VALUE;
            } else {
                c32456y = new C32456y(this, continuationImpl);
            }
        } else {
            c32456y = new C32456y(this, continuationImpl);
        }
        Object objM70042a = c32456y.f66167a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32456y.f66169c;
        boolean zAreEqual = false;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM70042a);
            InterfaceC29984m interfaceC29984m = this.f66045d;
            c32456y.f66169c = 1;
            objM70042a = ((C29967J) interfaceC29984m).m70042a(false, (Continuation) c32456y);
            if (objM70042a == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM70042a);
        }
        AbstractC29172p abstractC29172p = (AbstractC29172p) ((AbstractC29971N) objM70042a).m70051c();
        if (abstractC29172p != null && (c29140j3Mo69761l = abstractC29172p.mo69761l()) != null && (c28994d3 = c29140j3Mo69761l.f59119c) != null) {
            zAreEqual = Intrinsics.areEqual(c28994d3.f58921a, Boxing.boxBoolean(true));
        }
        return Boxing.boxBoolean(zAreEqual);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:105:0x0317  */
    /* JADX WARN: Code duplicated, block: B:109:0x033c  */
    /* JADX WARN: Code duplicated, block: B:113:0x0362  */
    /* JADX WARN: Code duplicated, block: B:116:0x0390 A[LOOP:2: B:115:0x038e->B:116:0x0390, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:119:0x03ba  */
    /* JADX WARN: Code duplicated, block: B:121:0x03cb  */
    /* JADX WARN: Code duplicated, block: B:123:0x03d3  */
    /* JADX WARN: Code duplicated, block: B:124:0x03e2  */
    /* JADX WARN: Code duplicated, block: B:126:0x03e5  */
    /* JADX WARN: Code duplicated, block: B:127:0x03e8  */
    /* JADX WARN: Code duplicated, block: B:132:0x03f5  */
    /* JADX WARN: Code duplicated, block: B:135:0x03fc  */
    /* JADX WARN: Code duplicated, block: B:137:0x0403  */
    /* JADX WARN: Code duplicated, block: B:140:0x0418  */
    /* JADX WARN: Code duplicated, block: B:142:0x041b  */
    /* JADX WARN: Code duplicated, block: B:145:0x0422  */
    /* JADX WARN: Code duplicated, block: B:147:0x0429  */
    /* JADX WARN: Code duplicated, block: B:149:0x0437  */
    /* JADX WARN: Code duplicated, block: B:150:0x043a  */
    /* JADX WARN: Code duplicated, block: B:153:0x043f  */
    /* JADX WARN: Code duplicated, block: B:155:0x0443  */
    /* JADX WARN: Code duplicated, block: B:158:0x044a  */
    /* JADX WARN: Code duplicated, block: B:160:0x0451  */
    /* JADX WARN: Code duplicated, block: B:162:0x0463  */
    /* JADX WARN: Code duplicated, block: B:163:0x0466  */
    /* JADX WARN: Code duplicated, block: B:165:0x0469  */
    /* JADX WARN: Code duplicated, block: B:169:0x0472  */
    /* JADX WARN: Code duplicated, block: B:171:0x0476  */
    /* JADX WARN: Code duplicated, block: B:175:0x0487  */
    /* JADX WARN: Code duplicated, block: B:178:0x048d  */
    /* JADX WARN: Code duplicated, block: B:180:0x0491  */
    /* JADX WARN: Code duplicated, block: B:181:0x0494  */
    /* JADX WARN: Code duplicated, block: B:184:0x0498  */
    /* JADX WARN: Code duplicated, block: B:186:0x049b  */
    /* JADX WARN: Code duplicated, block: B:188:0x04a7  */
    /* JADX WARN: Code duplicated, block: B:193:0x04ce A[LOOP:8: B:192:0x04cc->B:193:0x04ce, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:197:0x04f8  */
    /* JADX WARN: Code duplicated, block: B:200:0x0504  */
    /* JADX WARN: Code duplicated, block: B:201:0x0506  */
    /* JADX WARN: Code duplicated, block: B:202:0x050b  */
    /* JADX WARN: Code duplicated, block: B:206:0x051b  */
    /* JADX WARN: Code duplicated, block: B:211:0x0526  */
    /* JADX WARN: Code duplicated, block: B:213:0x0529  */
    /* JADX WARN: Code duplicated, block: B:217:0x054a  */
    /* JADX WARN: Code duplicated, block: B:220:0x0553  */
    /* JADX WARN: Code duplicated, block: B:221:0x0560  */
    /* JADX WARN: Code duplicated, block: B:224:0x0569  */
    /* JADX WARN: Code duplicated, block: B:228:0x0573  */
    /* JADX WARN: Code duplicated, block: B:229:0x0576  */
    /* JADX WARN: Code duplicated, block: B:232:0x057a  */
    /* JADX WARN: Code duplicated, block: B:234:0x057d  */
    /* JADX WARN: Code duplicated, block: B:240:0x0599  */
    /* JADX WARN: Code duplicated, block: B:243:0x05a2  */
    /* JADX WARN: Code duplicated, block: B:244:0x05b4  */
    /* JADX WARN: Code duplicated, block: B:248:0x05cb  */
    /* JADX WARN: Code duplicated, block: B:267:0x0623  */
    /* JADX WARN: Code duplicated, block: B:271:0x063f  */
    /* JADX WARN: Code duplicated, block: B:291:0x06a3  */
    /* JADX WARN: Code duplicated, block: B:295:0x06bb  */
    /* JADX WARN: Code duplicated, block: B:299:0x06db  */
    /* JADX WARN: Code duplicated, block: B:305:0x0707 A[LOOP:0: B:303:0x0701->B:305:0x0707, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:309:0x0725  */
    /* JADX WARN: Code duplicated, block: B:312:0x0736  */
    /* JADX WARN: Code duplicated, block: B:317:0x074a  */
    /* JADX WARN: Code duplicated, block: B:318:0x074d  */
    /* JADX WARN: Code duplicated, block: B:321:0x0756  */
    /* JADX WARN: Code duplicated, block: B:322:0x075b  */
    /* JADX WARN: Code duplicated, block: B:325:0x0760 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:331:0x073e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:333:0x0730 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:336:0x03eb A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:339:0x03b8 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:341:0x0418 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:342:0x0415 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:343:? A[LOOP:4: B:136:0x0401->B:343:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:344:0x043f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:345:0x043d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:348:? A[LOOP:5: B:146:0x0427->B:348:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:349:0x048b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:350:0x048d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:353:? A[LOOP:6: B:159:0x044f->B:353:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:355:0x04b6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:357:0x04a5 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:49:0x0206  */
    /* JADX WARN: Code duplicated, block: B:52:0x0211 A[PHI: r2
      0x0211: PHI (r2v23 java.lang.Object) = (r2v22 java.lang.Object), (r2v1 java.lang.Object) binds: [B:50:0x020d, B:32:0x01d3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0215  */
    /* JADX WARN: Code duplicated, block: B:55:0x0222  */
    /* JADX WARN: Code duplicated, block: B:59:0x0236  */
    /* JADX WARN: Code duplicated, block: B:71:0x0264  */
    /* JADX WARN: Code duplicated, block: B:72:0x0271  */
    /* JADX WARN: Code duplicated, block: B:78:0x028b  */
    /* JADX WARN: Code duplicated, block: B:7:0x001a  */
    /* JADX WARN: Code duplicated, block: B:82:0x02a3  */
    /* JADX INFO: renamed from: a */
    public final Object m71116a(C28879c c28879c, ContinuationImpl continuationImpl) {
        C32398G c32398g;
        List list;
        boolean z11;
        boolean z12;
        C28879c c28879c2;
        AbstractC32410T c32408q;
        AbstractC29172p abstractC29172p;
        Object string;
        AbstractC29172p abstractC29172p2;
        AbstractC29172p abstractC29172p3;
        String str;
        Spanned spannedM69364a;
        C28716e c28716e;
        C28716e c28716e2;
        String str2;
        Spanned spannedM69364a2;
        C29164n3 c29164n3;
        Spanned spannedM69364a3;
        C28716e c28716e3;
        C28716e c28716e4;
        String str3;
        String str4;
        CharSequence charSequenceM69364a;
        C29164n3 c29164n4;
        Object string2;
        CharSequence charSequence;
        String str5;
        boolean z13;
        Spanned spannedM69364a4;
        C28716e c28716e5;
        C28716e c28716e6;
        String str6;
        CharSequence charSequence2;
        Object string3;
        C28879c c28879c3;
        CharSequence charSequence3;
        CharSequence charSequence4;
        Object string4;
        CharSequence charSequence5;
        CharSequence charSequence6;
        AbstractC29172p abstractC29172p4;
        CharSequence charSequence7;
        List listEmptyList;
        Object string5;
        CharSequence charSequence8;
        C28879c c28879c4;
        AbstractC29172p abstractC29172p5;
        CharSequence charSequence9;
        CharSequence charSequence10;
        List list2;
        CharSequence charSequence11;
        Object objM70193a;
        CharSequence charSequence12;
        CharSequence charSequence13;
        C32405N c32405n;
        ArrayList arrayListM71114a;
        ArrayList arrayList;
        int size;
        int i11;
        ArrayList arrayList2;
        int size2;
        int i12;
        int i13;
        C32405N c32405n2;
        C32405N c32405n3;
        ArrayList arrayList3;
        int size3;
        int i14;
        List mutableList;
        ArrayList arrayList4;
        int size4;
        int i15;
        Object objM71118a;
        List list3;
        List list4;
        AbstractC29172p abstractC29172p6;
        C32405N c32405n4;
        Object obj;
        int i16;
        int i17;
        int i18;
        int size5;
        int i19;
        C29164n3 review;
        String str7;
        int i21;
        int i22;
        int size6;
        int i23;
        Object obj2;
        int i24;
        int size7;
        int i25;
        Object obj3;
        Object obj4;
        C28713b c28713b;
        int i26;
        List list5;
        boolean zContains;
        List list6;
        List list7;
        C29164n3 c29164n5;
        String str8;
        List list8;
        CharSequence charSequence14;
        Object string6;
        C28879c c28879c5;
        CharSequence charSequence15;
        CharSequence charSequence16;
        Object string7;
        CharSequence charSequence17;
        List list9;
        CharSequence charSequence18;
        CharSequence charSequence19;
        Object string8;
        C28879c c28879c6;
        CharSequence charSequence20;
        CharSequence charSequence21;
        Object string9;
        List list10;
        CharSequence charSequence22;
        CharSequence charSequence23;
        List listEmptyList2;
        Object string10;
        CharSequence charSequence24;
        CharSequence charSequence25;
        List list11;
        CharSequence charSequence26;
        AbstractC32410T abstractC32410T;
        ArrayList arrayList5;
        C28716e c28716e7;
        SNSStepState sNSStepState;
        Integer autoCloseOnApproveTimeout;
        int iIntValue;
        ArrayList arrayList6;
        Iterator it;
        C28879c c28879c7 = c28879c;
        int i27 = 1;
        if (continuationImpl instanceof C32398G) {
            c32398g = (C32398G) continuationImpl;
            int i28 = c32398g.f66023j;
            if ((i28 & Integer.MIN_VALUE) != 0) {
                c32398g.f66023j = i28 - Integer.MIN_VALUE;
            } else {
                c32398g = new C32398G(this, continuationImpl);
            }
        } else {
            c32398g = new C32398G(this, continuationImpl);
        }
        Object string11 = c32398g.f66021h;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (c32398g.f66023j) {
            case 0:
                ResultKt.throwOnFailure(string11);
                AbstractC29172p abstractC29172p7 = this.f66051j;
                if (abstractC29172p7 != null && (list = this.f66052k) != null) {
                    if (abstractC29172p7.m69798n()) {
                        if (!(currentState() instanceof C32406O)) {
                            c32398g.f66023j = 1;
                            if (DelayKt.m90350b(3000L, c32398g) != coroutine_suspended) {
                                c32398g.f66023j = 2;
                                string11 = getString("sns_status_APPROVED_subtitle", c32398g);
                                if (string11 != coroutine_suspended) {
                                    str = (String) string11;
                                    if (str != null) {
                                        spannedM69364a = AbstractC28462i0.m69364a(str, ((C28547d) this.f66047f).f58099a.f58163a);
                                    } else {
                                        spannedM69364a = null;
                                    }
                                    c28716e = new C28716e(spannedM69364a, null, SNSStepState.APPROVED);
                                    c32398g.f66014a = c28716e;
                                    c32398g.f66023j = 3;
                                    string11 = getString("sns_status_APPROVED_footerHtml", c32398g);
                                    if (string11 != coroutine_suspended) {
                                        c28716e2 = c28716e;
                                        c32408q = new C32408Q(c28716e2, (CharSequence) string11, SNSApplicantStatusAnalyticsState.Approved);
                                        i27 = 1;
                                        abstractC32410T = c32408q;
                                        if (abstractC32410T instanceof C32408Q) {
                                            List list12 = abstractC32410T.f66068d;
                                            arrayList5 = new ArrayList();
                                            for (Object obj5 : list12) {
                                                if (obj5 instanceof C28716e) {
                                                    arrayList5.add(obj5);
                                                }
                                            }
                                            c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                            if (c28716e7 != null) {
                                                sNSStepState = c28716e7.f58403d;
                                            } else {
                                                sNSStepState = null;
                                            }
                                            autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                            if (autoCloseOnApproveTimeout != null) {
                                                iIntValue = autoCloseOnApproveTimeout.intValue();
                                            } else {
                                                iIntValue = 3;
                                            }
                                            if (sNSStepState == SNSStepState.APPROVED && iIntValue > 0) {
                                                AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                            }
                                        }
                                        AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        } else {
                            c32398g.f66023j = 2;
                            string11 = getString("sns_status_APPROVED_subtitle", c32398g);
                            if (string11 != coroutine_suspended) {
                                str = (String) string11;
                                if (str != null) {
                                    spannedM69364a = AbstractC28462i0.m69364a(str, ((C28547d) this.f66047f).f58099a.f58163a);
                                } else {
                                    spannedM69364a = null;
                                }
                                c28716e = new C28716e(spannedM69364a, null, SNSStepState.APPROVED);
                                c32398g.f66014a = c28716e;
                                c32398g.f66023j = 3;
                                string11 = getString("sns_status_APPROVED_footerHtml", c32398g);
                                if (string11 != coroutine_suspended) {
                                    c28716e2 = c28716e;
                                    c32408q = new C32408Q(c28716e2, (CharSequence) string11, SNSApplicantStatusAnalyticsState.Approved);
                                    i27 = 1;
                                    abstractC32410T = c32408q;
                                    if (abstractC32410T instanceof C32408Q) {
                                        List list13 = abstractC32410T.f66068d;
                                        arrayList5 = new ArrayList();
                                        while (r1.hasNext()) {
                                            if (obj5 instanceof C28716e) {
                                                arrayList5.add(obj5);
                                            }
                                        }
                                        c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                        if (c28716e7 != null) {
                                            sNSStepState = c28716e7.f58403d;
                                        } else {
                                            sNSStepState = null;
                                        }
                                        autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                        if (autoCloseOnApproveTimeout != null) {
                                            iIntValue = autoCloseOnApproveTimeout.intValue();
                                        } else {
                                            iIntValue = 3;
                                        }
                                        if (sNSStepState == SNSStepState.APPROVED) {
                                            AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                        }
                                    }
                                    AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } else if (abstractC29172p7.m69799o()) {
                        c32398g.f66014a = abstractC29172p7;
                        c32398g.f66023j = 4;
                        Object string12 = getString("sns_status_FINAL_REJECT_subtitle", c32398g);
                        if (string12 != coroutine_suspended) {
                            string11 = string12;
                            abstractC29172p3 = abstractC29172p7;
                            str2 = (String) string11;
                            if (str2 != null) {
                                spannedM69364a2 = AbstractC28462i0.m69364a(str2, ((C28547d) this.f66047f).f58099a.f58163a);
                            } else {
                                spannedM69364a2 = null;
                            }
                            c29164n3 = abstractC29172p3.mo69762m().f59168e;
                            if (c29164n3 != null || (str3 = c29164n3.f59159a) == null) {
                                spannedM69364a3 = null;
                            } else {
                                spannedM69364a3 = AbstractC28462i0.m69364a(str3, ((C28547d) this.f66047f).f58099a.f58163a);
                            }
                            c28716e3 = new C28716e(spannedM69364a2, spannedM69364a3, SNSStepState.REJECTED);
                            c32398g.f66014a = c28716e3;
                            c32398g.f66023j = 5;
                            string11 = getString("sns_status_FINAL_REJECT_footerHtml", c32398g);
                            if (string11 != coroutine_suspended) {
                                c28716e4 = c28716e3;
                                c32408q = new C32408Q(c28716e4, (CharSequence) string11, SNSApplicantStatusAnalyticsState.FinallyRejected);
                                i27 = 1;
                                abstractC32410T = c32408q;
                                if (abstractC32410T instanceof C32408Q) {
                                    List list14 = abstractC32410T.f66068d;
                                    arrayList5 = new ArrayList();
                                    while (r1.hasNext()) {
                                        if (obj5 instanceof C28716e) {
                                            arrayList5.add(obj5);
                                        }
                                    }
                                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                    if (c28716e7 != null) {
                                        sNSStepState = c28716e7.f58403d;
                                    } else {
                                        sNSStepState = null;
                                    }
                                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                    if (autoCloseOnApproveTimeout != null) {
                                        iIntValue = autoCloseOnApproveTimeout.intValue();
                                    } else {
                                        iIntValue = 3;
                                    }
                                    if (sNSStepState == SNSStepState.APPROVED) {
                                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                    }
                                }
                                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                return Unit.INSTANCE;
                            }
                        }
                    } else if (abstractC29172p7.m69800p()) {
                        if (!list.isEmpty()) {
                            Iterator it2 = list.iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    if (!((Document) it2.next()).isApproved()) {
                                        c32398g.f66014a = c28879c7;
                                        c32398g.f66015b = abstractC29172p7;
                                        c32398g.f66023j = 9;
                                        Object string13 = getString("sns_status_REJECT_title", c32398g);
                                        if (string13 != coroutine_suspended) {
                                            abstractC29172p = abstractC29172p7;
                                            string11 = string13;
                                            charSequence2 = (CharSequence) string11;
                                            c32398g.f66014a = c28879c7;
                                            c32398g.f66015b = abstractC29172p;
                                            c32398g.f66016c = charSequence2;
                                            c32398g.f66023j = 10;
                                            string3 = getString("sns_status_REJECT_subtitle", c32398g);
                                            if (string3 != coroutine_suspended) {
                                                c28879c3 = c28879c7;
                                                charSequence3 = charSequence2;
                                                string11 = string3;
                                                charSequence4 = (CharSequence) string11;
                                                c32398g.f66014a = c28879c3;
                                                c32398g.f66015b = abstractC29172p;
                                                c32398g.f66016c = charSequence3;
                                                c32398g.f66017d = charSequence4;
                                                c32398g.f66023j = 11;
                                                string4 = getString("sns_status_REJECT_footerHtml", c32398g);
                                                if (string4 != coroutine_suspended) {
                                                    AbstractC29172p abstractC29172p8 = abstractC29172p;
                                                    charSequence5 = charSequence3;
                                                    charSequence6 = charSequence4;
                                                    string11 = string4;
                                                    abstractC29172p4 = abstractC29172p8;
                                                    charSequence7 = (CharSequence) string11;
                                                    listEmptyList = CollectionsKt.emptyList();
                                                    c32398g.f66014a = c28879c3;
                                                    c32398g.f66015b = abstractC29172p4;
                                                    c32398g.f66016c = charSequence5;
                                                    c32398g.f66017d = charSequence6;
                                                    c32398g.f66018e = charSequence7;
                                                    c32398g.f66019f = listEmptyList;
                                                    c32398g.f66023j = 12;
                                                    string5 = getString("sns_status_REJECT_action_continue", c32398g);
                                                    if (string5 != coroutine_suspended) {
                                                        charSequence8 = charSequence7;
                                                        string11 = string5;
                                                        c28879c4 = c28879c3;
                                                        abstractC29172p5 = abstractC29172p4;
                                                        charSequence9 = charSequence6;
                                                        charSequence10 = charSequence5;
                                                        list2 = listEmptyList;
                                                        charSequence11 = (CharSequence) string11;
                                                        C30336z c30336z = this.f66044c;
                                                        c32398g.f66014a = c28879c4;
                                                        c32398g.f66015b = abstractC29172p5;
                                                        c32398g.f66016c = charSequence10;
                                                        c32398g.f66017d = charSequence9;
                                                        c32398g.f66018e = charSequence8;
                                                        c32398g.f66019f = list2;
                                                        c32398g.f66020g = charSequence11;
                                                        c32398g.f66023j = 13;
                                                        objM70193a = c30336z.m70193a(c32398g);
                                                        if (objM70193a != coroutine_suspended) {
                                                            charSequence12 = charSequence10;
                                                            charSequence13 = charSequence11;
                                                            string11 = objM70193a;
                                                            c32405n = new C32405N(charSequence12, charSequence9, charSequence8, list2, charSequence13, ((Boolean) string11).booleanValue(), SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                                                            arrayListM71114a = m71114a(c28879c4.f58723c, abstractC29172p5);
                                                            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                                                            size = arrayListM71114a.size();
                                                            i11 = 0;
                                                            while (i11 < size) {
                                                                Object obj6 = arrayListM71114a.get(i11);
                                                                i11 += i27;
                                                                arrayList.add(AbstractC28878b.m69662a(getStrings(), (Document) obj6, ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c4));
                                                                i27 = i27;
                                                            }
                                                            i27 = i27;
                                                            arrayList2 = new ArrayList();
                                                            size2 = arrayList.size();
                                                            i12 = 0;
                                                            while (i12 < size2) {
                                                                obj4 = arrayList.get(i12);
                                                                i12++;
                                                                c28713b = (C28713b) obj4;
                                                                if (abstractC29172p5.mo69760k().f59152b) {
                                                                    list5 = abstractC29172p5.mo69760k().f59154d;
                                                                    if (list5 != null) {
                                                                        zContains = list5.contains(c28713b.f58397f.f58399b.getType().f59014a);
                                                                    } else {
                                                                        zContains = false;
                                                                    }
                                                                    if (zContains) {
                                                                        i26 = 0;
                                                                    } else {
                                                                        i26 = i27;
                                                                    }
                                                                } else {
                                                                    i26 = 0;
                                                                }
                                                                if (i26 != 0) {
                                                                    arrayList2.add(obj4);
                                                                }
                                                            }
                                                            if (arrayList2.isEmpty()) {
                                                                i13 = 0;
                                                            } else {
                                                                if (arrayList2.isEmpty()) {
                                                                    i16 = 0;
                                                                } else {
                                                                    size7 = arrayList2.size();
                                                                    i25 = 0;
                                                                    while (true) {
                                                                        if (i25 < size7) {
                                                                            obj3 = arrayList2.get(i25);
                                                                            i25++;
                                                                            if (!((C28713b) obj3).f58397f.f58399b.isApproved()) {
                                                                                i16 = i27;
                                                                            }
                                                                        } else {
                                                                            i16 = 0;
                                                                        }
                                                                    }
                                                                }
                                                                if (i16 == 0) {
                                                                    i13 = 0;
                                                                } else {
                                                                    if (arrayList2.isEmpty()) {
                                                                        i17 = i27;
                                                                    } else {
                                                                        size6 = arrayList2.size();
                                                                        i23 = 0;
                                                                        while (true) {
                                                                            if (i23 < size6) {
                                                                                obj2 = arrayList2.get(i23);
                                                                                i23++;
                                                                                if (((C28713b) obj2).f58393b == SNSStepState.REJECTED) {
                                                                                    i24 = i27;
                                                                                } else {
                                                                                    i24 = 0;
                                                                                }
                                                                                if (i24 == 0) {
                                                                                    i17 = 0;
                                                                                }
                                                                            } else {
                                                                                i17 = i27;
                                                                            }
                                                                        }
                                                                    }
                                                                    if (i17 == 0) {
                                                                        i13 = 0;
                                                                    } else {
                                                                        if (arrayList2.isEmpty()) {
                                                                            i18 = i27;
                                                                        } else {
                                                                            size5 = arrayList2.size();
                                                                            i19 = 0;
                                                                            while (true) {
                                                                                if (i19 < size5) {
                                                                                    Object obj7 = arrayList2.get(i19);
                                                                                    i19++;
                                                                                    C28713b c28713b2 = (C28713b) obj7;
                                                                                    review = c28713b2.f58397f.f58399b.getReview();
                                                                                    if (review != null) {
                                                                                        str7 = review.f59159a;
                                                                                    } else {
                                                                                        str7 = null;
                                                                                    }
                                                                                    if (str7 != null || str7.length() == 0) {
                                                                                        i21 = i27;
                                                                                    } else {
                                                                                        i21 = 0;
                                                                                    }
                                                                                    if (i21 == 0 || c28713b2.f58397f.f58399b.getType().m69746c()) {
                                                                                        i22 = i27;
                                                                                    } else {
                                                                                        i22 = 0;
                                                                                    }
                                                                                    if (i22 == 0) {
                                                                                        i18 = 0;
                                                                                    }
                                                                                } else {
                                                                                    i18 = i27;
                                                                                }
                                                                            }
                                                                        }
                                                                        if (i18 != 0) {
                                                                            i13 = i27;
                                                                        } else {
                                                                            i13 = 0;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            if (i13 == 0) {
                                                                arrayList2 = null;
                                                            }
                                                            if (arrayList2 != null) {
                                                                arrayList3 = new ArrayList();
                                                                size3 = arrayList.size();
                                                                i14 = 0;
                                                                while (i14 < size3) {
                                                                    obj = arrayList.get(i14);
                                                                    i14++;
                                                                    if (!arrayList2.contains((C28713b) obj)) {
                                                                        arrayList3.add(obj);
                                                                    }
                                                                }
                                                                mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
                                                                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                                                                size4 = arrayList2.size();
                                                                i15 = 0;
                                                                while (i15 < size4) {
                                                                    Object obj8 = arrayList2.get(i15);
                                                                    i15++;
                                                                    arrayList4.add(((C28713b) obj8).f58397f.f58399b);
                                                                }
                                                                c32398g.f66014a = abstractC29172p5;
                                                                c32398g.f66015b = c32405n;
                                                                c32398g.f66016c = c32405n;
                                                                c32398g.f66017d = mutableList;
                                                                c32398g.f66018e = c32405n;
                                                                c32398g.f66019f = mutableList;
                                                                c32398g.f66020g = arrayList;
                                                                c32398g.f66023j = 14;
                                                                objM71118a = m71118a(arrayList4, c32398g);
                                                                if (objM71118a != coroutine_suspended) {
                                                                    string11 = objM71118a;
                                                                    list3 = arrayList;
                                                                    c32405n3 = c32405n;
                                                                    list4 = mutableList;
                                                                    abstractC29172p6 = abstractC29172p5;
                                                                    c32405n4 = c32405n3;
                                                                    list8 = mutableList;
                                                                    list4.add(string11);
                                                                    if (list8 != null) {
                                                                        c32408q = c32405n4;
                                                                        list7 = list8;
                                                                    } else {
                                                                        list6 = list3;
                                                                        c32405n2 = c32405n;
                                                                        c32405n = c32405n4;
                                                                        abstractC29172p5 = abstractC29172p6;
                                                                    }
                                                                    c32405n.f66068d = list7;
                                                                    c29164n5 = abstractC29172p6.mo69762m().f59168e;
                                                                    if (c29164n5 != null && (str8 = c29164n5.f59159a) != null) {
                                                                        if (StringsKt.isBlank(str8)) {
                                                                            str8 = null;
                                                                        }
                                                                        if (str8 != null) {
                                                                            List mutableList2 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                                                                            mutableList2.add(0, new C28715d(str8));
                                                                            c32405n3.f66068d = mutableList2;
                                                                            Unit unit = Unit.INSTANCE;
                                                                        }
                                                                    }
                                                                    abstractC32410T = c32408q;
                                                                    if (abstractC32410T instanceof C32408Q) {
                                                                        List list15 = abstractC32410T.f66068d;
                                                                        arrayList5 = new ArrayList();
                                                                        while (r1.hasNext()) {
                                                                            if (obj5 instanceof C28716e) {
                                                                                arrayList5.add(obj5);
                                                                            }
                                                                        }
                                                                        c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                                                        if (c28716e7 != null) {
                                                                            sNSStepState = c28716e7.f58403d;
                                                                        } else {
                                                                            sNSStepState = null;
                                                                        }
                                                                        autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                                                        if (autoCloseOnApproveTimeout != null) {
                                                                            iIntValue = autoCloseOnApproveTimeout.intValue();
                                                                        } else {
                                                                            iIntValue = 3;
                                                                        }
                                                                        if (sNSStepState == SNSStepState.APPROVED) {
                                                                            AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                                                        }
                                                                    }
                                                                    AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                                                    return Unit.INSTANCE;
                                                                }
                                                            } else {
                                                                c32405n2 = c32405n;
                                                                c32405n3 = c32405n2;
                                                                list6 = arrayList;
                                                            }
                                                            list7 = list6;
                                                            c32408q = c32405n;
                                                            abstractC29172p6 = abstractC29172p5;
                                                            c32405n = c32405n2;
                                                            c32405n.f66068d = list7;
                                                            c29164n5 = abstractC29172p6.mo69762m().f59168e;
                                                            if (c29164n5 != null) {
                                                                if (StringsKt.isBlank(str8)) {
                                                                    str8 = null;
                                                                }
                                                                if (str8 != null) {
                                                                    List mutableList3 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                                                                    mutableList3.add(0, new C28715d(str8));
                                                                    c32405n3.f66068d = mutableList3;
                                                                    Unit unit2 = Unit.INSTANCE;
                                                                }
                                                            }
                                                            abstractC32410T = c32408q;
                                                            if (abstractC32410T instanceof C32408Q) {
                                                                List list16 = abstractC32410T.f66068d;
                                                                arrayList5 = new ArrayList();
                                                                while (r1.hasNext()) {
                                                                    if (obj5 instanceof C28716e) {
                                                                        arrayList5.add(obj5);
                                                                    }
                                                                }
                                                                c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                                                if (c28716e7 != null) {
                                                                    sNSStepState = c28716e7.f58403d;
                                                                } else {
                                                                    sNSStepState = null;
                                                                }
                                                                autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                                                if (autoCloseOnApproveTimeout != null) {
                                                                    iIntValue = autoCloseOnApproveTimeout.intValue();
                                                                } else {
                                                                    iIntValue = 3;
                                                                }
                                                                if (sNSStepState == SNSStepState.APPROVED) {
                                                                    AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                                                }
                                                            }
                                                            AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                                            return Unit.INSTANCE;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    c32398g.f66014a = abstractC29172p7;
                                    c32398g.f66023j = 6;
                                    string = getString("sns_status_REJECT_title", c32398g);
                                    if (string != coroutine_suspended) {
                                        string11 = string;
                                        abstractC29172p2 = abstractC29172p7;
                                        str4 = (String) string11;
                                        if (str4 != null) {
                                            charSequenceM69364a = AbstractC28462i0.m69364a(str4, ((C28547d) this.f66047f).f58099a.f58163a);
                                        } else {
                                            charSequenceM69364a = null;
                                        }
                                        c29164n4 = abstractC29172p2.mo69762m().f59168e;
                                        if (c29164n4 != null) {
                                            if (str5.length() == 0) {
                                                z13 = true;
                                            } else {
                                                z13 = false;
                                            }
                                            if (z13) {
                                                str5 = null;
                                            }
                                            if (str5 == null) {
                                            }
                                        }
                                        c32398g.f66014a = charSequenceM69364a;
                                        c32398g.f66023j = 7;
                                        string2 = getString("sns_status_REJECT_subtitle", c32398g);
                                        if (string2 != coroutine_suspended) {
                                            CharSequence charSequence27 = charSequenceM69364a;
                                            string11 = string2;
                                            charSequence = charSequence27;
                                            str6 = (String) string11;
                                            if (str6 != null) {
                                                Spanned spannedM69364a5 = AbstractC28462i0.m69364a(str6, ((C28547d) this.f66047f).f58099a.f58163a);
                                                charSequenceM69364a = charSequence;
                                                spannedM69364a4 = spannedM69364a5;
                                            } else {
                                                charSequenceM69364a = charSequence;
                                                spannedM69364a4 = null;
                                            }
                                            c28716e5 = new C28716e(charSequenceM69364a, spannedM69364a4, SNSStepState.REJECTED);
                                            c32398g.f66014a = c28716e5;
                                            c32398g.f66023j = 8;
                                            string11 = getString("sns_status_REJECT_footerHtml", c32398g);
                                            if (string11 != coroutine_suspended) {
                                                c28716e6 = c28716e5;
                                                c32408q = new C32408Q(c28716e6, (CharSequence) string11, SNSApplicantStatusAnalyticsState.TemporarilyDeclined);
                                                abstractC32410T = c32408q;
                                                if (abstractC32410T instanceof C32408Q) {
                                                    List list17 = abstractC32410T.f66068d;
                                                    arrayList5 = new ArrayList();
                                                    while (r1.hasNext()) {
                                                        if (obj5 instanceof C28716e) {
                                                            arrayList5.add(obj5);
                                                        }
                                                    }
                                                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                                    if (c28716e7 != null) {
                                                        sNSStepState = c28716e7.f58403d;
                                                    } else {
                                                        sNSStepState = null;
                                                    }
                                                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                                    if (autoCloseOnApproveTimeout != null) {
                                                        iIntValue = autoCloseOnApproveTimeout.intValue();
                                                    } else {
                                                        iIntValue = 3;
                                                    }
                                                    if (sNSStepState == SNSStepState.APPROVED) {
                                                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                                    }
                                                }
                                                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                                return Unit.INSTANCE;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            c32398g.f66014a = abstractC29172p7;
                            c32398g.f66023j = 6;
                            string = getString("sns_status_REJECT_title", c32398g);
                            if (string != coroutine_suspended) {
                                string11 = string;
                                abstractC29172p2 = abstractC29172p7;
                                str4 = (String) string11;
                                if (str4 != null) {
                                    charSequenceM69364a = AbstractC28462i0.m69364a(str4, ((C28547d) this.f66047f).f58099a.f58163a);
                                } else {
                                    charSequenceM69364a = null;
                                }
                                c29164n4 = abstractC29172p2.mo69762m().f59168e;
                                if (c29164n4 != null && (str5 = c29164n4.f59159a) != null) {
                                    if (str5.length() == 0) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    if (z13) {
                                        str5 = null;
                                    }
                                    if (str5 == null && (spannedM69364a4 = AbstractC28462i0.m69364a(str5, ((C28547d) this.f66047f).f58099a.f58163a)) != null) {
                                        c28716e5 = new C28716e(charSequenceM69364a, spannedM69364a4, SNSStepState.REJECTED);
                                        c32398g.f66014a = c28716e5;
                                        c32398g.f66023j = 8;
                                        string11 = getString("sns_status_REJECT_footerHtml", c32398g);
                                        if (string11 != coroutine_suspended) {
                                            c28716e6 = c28716e5;
                                            c32408q = new C32408Q(c28716e6, (CharSequence) string11, SNSApplicantStatusAnalyticsState.TemporarilyDeclined);
                                            abstractC32410T = c32408q;
                                            if (abstractC32410T instanceof C32408Q) {
                                                List list18 = abstractC32410T.f66068d;
                                                arrayList5 = new ArrayList();
                                                while (r1.hasNext()) {
                                                    if (obj5 instanceof C28716e) {
                                                        arrayList5.add(obj5);
                                                    }
                                                }
                                                c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                                if (c28716e7 != null) {
                                                    sNSStepState = c28716e7.f58403d;
                                                } else {
                                                    sNSStepState = null;
                                                }
                                                autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                                if (autoCloseOnApproveTimeout != null) {
                                                    iIntValue = autoCloseOnApproveTimeout.intValue();
                                                } else {
                                                    iIntValue = 3;
                                                }
                                                if (sNSStepState == SNSStepState.APPROVED) {
                                                    AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                                }
                                            }
                                            AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                            return Unit.INSTANCE;
                                        }
                                    }
                                }
                                c32398g.f66014a = charSequenceM69364a;
                                c32398g.f66023j = 7;
                                string2 = getString("sns_status_REJECT_subtitle", c32398g);
                                if (string2 != coroutine_suspended) {
                                    CharSequence charSequence28 = charSequenceM69364a;
                                    string11 = string2;
                                    charSequence = charSequence28;
                                    str6 = (String) string11;
                                    if (str6 != null) {
                                        Spanned spannedM69364a6 = AbstractC28462i0.m69364a(str6, ((C28547d) this.f66047f).f58099a.f58163a);
                                        charSequenceM69364a = charSequence;
                                        spannedM69364a4 = spannedM69364a6;
                                    } else {
                                        charSequenceM69364a = charSequence;
                                        spannedM69364a4 = null;
                                    }
                                    c28716e5 = new C28716e(charSequenceM69364a, spannedM69364a4, SNSStepState.REJECTED);
                                    c32398g.f66014a = c28716e5;
                                    c32398g.f66023j = 8;
                                    string11 = getString("sns_status_REJECT_footerHtml", c32398g);
                                    if (string11 != coroutine_suspended) {
                                        c28716e6 = c28716e5;
                                        c32408q = new C32408Q(c28716e6, (CharSequence) string11, SNSApplicantStatusAnalyticsState.TemporarilyDeclined);
                                        abstractC32410T = c32408q;
                                        if (abstractC32410T instanceof C32408Q) {
                                            List list19 = abstractC32410T.f66068d;
                                            arrayList5 = new ArrayList();
                                            while (r1.hasNext()) {
                                                if (obj5 instanceof C28716e) {
                                                    arrayList5.add(obj5);
                                                }
                                            }
                                            c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                            if (c28716e7 != null) {
                                                sNSStepState = c28716e7.f58403d;
                                            } else {
                                                sNSStepState = null;
                                            }
                                            autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                            if (autoCloseOnApproveTimeout != null) {
                                                iIntValue = autoCloseOnApproveTimeout.intValue();
                                            } else {
                                                iIntValue = 3;
                                            }
                                            if (sNSStepState == SNSStepState.APPROVED) {
                                                AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                            }
                                        }
                                        AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        }
                    } else {
                        i27 = 1;
                        if (list.isEmpty()) {
                            z11 = true;
                        } else {
                            Iterator it3 = list.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    z11 = true;
                                } else if (!((Document) it3.next()).isApproved()) {
                                    z11 = false;
                                }
                            }
                        }
                        if (z11) {
                            c32398g.f66014a = c28879c7;
                            c32398g.f66015b = list;
                            c32398g.f66023j = 15;
                            string11 = getString("sns_status_APPROVED_title", c32398g);
                            if (string11 != coroutine_suspended) {
                                charSequence14 = (CharSequence) string11;
                                c32398g.f66014a = c28879c7;
                                c32398g.f66015b = list;
                                c32398g.f66016c = charSequence14;
                                c32398g.f66023j = 16;
                                string6 = getString("sns_status_APPROVED_subtitle", c32398g);
                                if (string6 != coroutine_suspended) {
                                    c28879c5 = c28879c7;
                                    charSequence15 = charSequence14;
                                    string11 = string6;
                                    charSequence16 = (CharSequence) string11;
                                    c32398g.f66014a = c28879c5;
                                    c32398g.f66015b = list;
                                    c32398g.f66016c = charSequence15;
                                    c32398g.f66017d = charSequence16;
                                    c32398g.f66023j = 17;
                                    string7 = getString("sns_status_APPROVED_footerHtml", c32398g);
                                    if (string7 != coroutine_suspended) {
                                        List list20 = list;
                                        charSequence17 = charSequence15;
                                        list9 = list20;
                                        C28879c c28879c8 = c28879c5;
                                        charSequence18 = charSequence16;
                                        string11 = string7;
                                        c28879c2 = c28879c8;
                                        c32408q = new C32405N(charSequence17, charSequence18, (CharSequence) string11, CollectionsKt.emptyList(), null, false, SNSApplicantStatusAnalyticsState.Approved, null);
                                        list = list9;
                                        arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                                        it = list.iterator();
                                        while (it.hasNext()) {
                                            arrayList6.add(AbstractC28878b.m69662a(getStrings(), (Document) it.next(), ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c2));
                                        }
                                        c32408q.f66068d = arrayList6;
                                        abstractC32410T = c32408q;
                                        if (abstractC32410T instanceof C32408Q) {
                                            List list110 = abstractC32410T.f66068d;
                                            arrayList5 = new ArrayList();
                                            while (r1.hasNext()) {
                                                if (obj5 instanceof C28716e) {
                                                    arrayList5.add(obj5);
                                                }
                                            }
                                            c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                            if (c28716e7 != null) {
                                                sNSStepState = c28716e7.f58403d;
                                            } else {
                                                sNSStepState = null;
                                            }
                                            autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                            if (autoCloseOnApproveTimeout != null) {
                                                iIntValue = autoCloseOnApproveTimeout.intValue();
                                            } else {
                                                iIntValue = 3;
                                            }
                                            if (sNSStepState == SNSStepState.APPROVED) {
                                                AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                            }
                                        }
                                        AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }
                        } else {
                            if (list.isEmpty()) {
                                z12 = false;
                            } else {
                                Iterator it4 = list.iterator();
                                while (true) {
                                    if (!it4.hasNext()) {
                                        z12 = false;
                                    } else if (((Document) it4.next()).isRejected()) {
                                        z12 = true;
                                    }
                                }
                            }
                            if (z12) {
                                c32398g.f66014a = c28879c7;
                                c32398g.f66015b = list;
                                c32398g.f66023j = 18;
                                string11 = getString("sns_status_REJECT_title", c32398g);
                                if (string11 != coroutine_suspended) {
                                    charSequence19 = (CharSequence) string11;
                                    c32398g.f66014a = c28879c7;
                                    c32398g.f66015b = list;
                                    c32398g.f66016c = charSequence19;
                                    c32398g.f66023j = 19;
                                    string8 = getString("sns_status_REJECT_subtitle", c32398g);
                                    if (string8 != coroutine_suspended) {
                                        c28879c6 = c28879c7;
                                        charSequence20 = charSequence19;
                                        string11 = string8;
                                        charSequence21 = (CharSequence) string11;
                                        c32398g.f66014a = c28879c6;
                                        c32398g.f66015b = list;
                                        c32398g.f66016c = charSequence20;
                                        c32398g.f66017d = charSequence21;
                                        c32398g.f66023j = 20;
                                        string9 = getString("sns_status_REJECT_footerHtml", c32398g);
                                        if (string9 != coroutine_suspended) {
                                            list10 = list;
                                            charSequence22 = charSequence21;
                                            string11 = string9;
                                            charSequence23 = (CharSequence) string11;
                                            listEmptyList2 = CollectionsKt.emptyList();
                                            c32398g.f66014a = c28879c6;
                                            c32398g.f66015b = list10;
                                            c32398g.f66016c = charSequence20;
                                            c32398g.f66017d = charSequence22;
                                            c32398g.f66018e = charSequence23;
                                            c32398g.f66019f = listEmptyList2;
                                            c32398g.f66023j = 21;
                                            string10 = getString("sns_status_REJECT_action_continue", c32398g);
                                            if (string10 != coroutine_suspended) {
                                                charSequence24 = charSequence22;
                                                charSequence25 = charSequence20;
                                                list9 = list10;
                                                list11 = listEmptyList2;
                                                charSequence26 = charSequence23;
                                                string11 = string10;
                                                c28879c2 = c28879c6;
                                                c32408q = new C32405N(charSequence25, charSequence24, charSequence26, list11, (CharSequence) string11, false, SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                                                list = list9;
                                            }
                                        }
                                    }
                                }
                            } else {
                                c28879c2 = c28879c7;
                                c32408q = C32406O.f66058h;
                            }
                            arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList6.add(AbstractC28878b.m69662a(getStrings(), (Document) it.next(), ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c2));
                            }
                            c32408q.f66068d = arrayList6;
                            abstractC32410T = c32408q;
                            if (abstractC32410T instanceof C32408Q) {
                                List list111 = abstractC32410T.f66068d;
                                arrayList5 = new ArrayList();
                                while (r1.hasNext()) {
                                    if (obj5 instanceof C28716e) {
                                        arrayList5.add(obj5);
                                    }
                                }
                                c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                if (c28716e7 != null) {
                                    sNSStepState = c28716e7.f58403d;
                                } else {
                                    sNSStepState = null;
                                }
                                autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                if (autoCloseOnApproveTimeout != null) {
                                    iIntValue = autoCloseOnApproveTimeout.intValue();
                                } else {
                                    iIntValue = 3;
                                }
                                if (sNSStepState == SNSStepState.APPROVED) {
                                    AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                }
                            }
                            AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                }
                return Unit.INSTANCE;
            case 1:
                ResultKt.throwOnFailure(string11);
                c32398g.f66023j = 2;
                string11 = getString("sns_status_APPROVED_subtitle", c32398g);
                if (string11 != coroutine_suspended) {
                    str = (String) string11;
                    if (str != null) {
                        spannedM69364a = AbstractC28462i0.m69364a(str, ((C28547d) this.f66047f).f58099a.f58163a);
                    } else {
                        spannedM69364a = null;
                    }
                    c28716e = new C28716e(spannedM69364a, null, SNSStepState.APPROVED);
                    c32398g.f66014a = c28716e;
                    c32398g.f66023j = 3;
                    string11 = getString("sns_status_APPROVED_footerHtml", c32398g);
                    if (string11 != coroutine_suspended) {
                        c28716e2 = c28716e;
                        c32408q = new C32408Q(c28716e2, (CharSequence) string11, SNSApplicantStatusAnalyticsState.Approved);
                        i27 = 1;
                        abstractC32410T = c32408q;
                        if (abstractC32410T instanceof C32408Q) {
                            List list112 = abstractC32410T.f66068d;
                            arrayList5 = new ArrayList();
                            while (r1.hasNext()) {
                                if (obj5 instanceof C28716e) {
                                    arrayList5.add(obj5);
                                }
                            }
                            c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                            if (c28716e7 != null) {
                                sNSStepState = c28716e7.f58403d;
                            } else {
                                sNSStepState = null;
                            }
                            autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                            if (autoCloseOnApproveTimeout != null) {
                                iIntValue = autoCloseOnApproveTimeout.intValue();
                            } else {
                                iIntValue = 3;
                            }
                            if (sNSStepState == SNSStepState.APPROVED) {
                                AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                            }
                        }
                        AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 2:
                ResultKt.throwOnFailure(string11);
                str = (String) string11;
                if (str != null) {
                    spannedM69364a = AbstractC28462i0.m69364a(str, ((C28547d) this.f66047f).f58099a.f58163a);
                } else {
                    spannedM69364a = null;
                }
                c28716e = new C28716e(spannedM69364a, null, SNSStepState.APPROVED);
                c32398g.f66014a = c28716e;
                c32398g.f66023j = 3;
                string11 = getString("sns_status_APPROVED_footerHtml", c32398g);
                if (string11 != coroutine_suspended) {
                    c28716e2 = c28716e;
                    c32408q = new C32408Q(c28716e2, (CharSequence) string11, SNSApplicantStatusAnalyticsState.Approved);
                    i27 = 1;
                    abstractC32410T = c32408q;
                    if (abstractC32410T instanceof C32408Q) {
                        List list113 = abstractC32410T.f66068d;
                        arrayList5 = new ArrayList();
                        while (r1.hasNext()) {
                            if (obj5 instanceof C28716e) {
                                arrayList5.add(obj5);
                            }
                        }
                        c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                        if (c28716e7 != null) {
                            sNSStepState = c28716e7.f58403d;
                        } else {
                            sNSStepState = null;
                        }
                        autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                        if (autoCloseOnApproveTimeout != null) {
                            iIntValue = autoCloseOnApproveTimeout.intValue();
                        } else {
                            iIntValue = 3;
                        }
                        if (sNSStepState == SNSStepState.APPROVED) {
                            AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                        }
                    }
                    AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 3:
                c28716e2 = (C28716e) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                c32408q = new C32408Q(c28716e2, (CharSequence) string11, SNSApplicantStatusAnalyticsState.Approved);
                i27 = 1;
                abstractC32410T = c32408q;
                if (abstractC32410T instanceof C32408Q) {
                    List list114 = abstractC32410T.f66068d;
                    arrayList5 = new ArrayList();
                    while (r1.hasNext()) {
                        if (obj5 instanceof C28716e) {
                            arrayList5.add(obj5);
                        }
                    }
                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                    if (c28716e7 != null) {
                        sNSStepState = c28716e7.f58403d;
                    } else {
                        sNSStepState = null;
                    }
                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                    if (autoCloseOnApproveTimeout != null) {
                        iIntValue = autoCloseOnApproveTimeout.intValue();
                    } else {
                        iIntValue = 3;
                    }
                    if (sNSStepState == SNSStepState.APPROVED) {
                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                    }
                }
                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                return Unit.INSTANCE;
            case 4:
                abstractC29172p3 = (AbstractC29172p) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                str2 = (String) string11;
                if (str2 != null) {
                    spannedM69364a2 = AbstractC28462i0.m69364a(str2, ((C28547d) this.f66047f).f58099a.f58163a);
                } else {
                    spannedM69364a2 = null;
                }
                c29164n3 = abstractC29172p3.mo69762m().f59168e;
                if (c29164n3 != null) {
                    spannedM69364a3 = null;
                } else {
                    spannedM69364a3 = null;
                }
                c28716e3 = new C28716e(spannedM69364a2, spannedM69364a3, SNSStepState.REJECTED);
                c32398g.f66014a = c28716e3;
                c32398g.f66023j = 5;
                string11 = getString("sns_status_FINAL_REJECT_footerHtml", c32398g);
                if (string11 != coroutine_suspended) {
                    c28716e4 = c28716e3;
                    c32408q = new C32408Q(c28716e4, (CharSequence) string11, SNSApplicantStatusAnalyticsState.FinallyRejected);
                    i27 = 1;
                    abstractC32410T = c32408q;
                    if (abstractC32410T instanceof C32408Q) {
                        List list115 = abstractC32410T.f66068d;
                        arrayList5 = new ArrayList();
                        while (r1.hasNext()) {
                            if (obj5 instanceof C28716e) {
                                arrayList5.add(obj5);
                            }
                        }
                        c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                        if (c28716e7 != null) {
                            sNSStepState = c28716e7.f58403d;
                        } else {
                            sNSStepState = null;
                        }
                        autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                        if (autoCloseOnApproveTimeout != null) {
                            iIntValue = autoCloseOnApproveTimeout.intValue();
                        } else {
                            iIntValue = 3;
                        }
                        if (sNSStepState == SNSStepState.APPROVED) {
                            AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                        }
                    }
                    AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 5:
                c28716e4 = (C28716e) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                c32408q = new C32408Q(c28716e4, (CharSequence) string11, SNSApplicantStatusAnalyticsState.FinallyRejected);
                i27 = 1;
                abstractC32410T = c32408q;
                if (abstractC32410T instanceof C32408Q) {
                    List list116 = abstractC32410T.f66068d;
                    arrayList5 = new ArrayList();
                    while (r1.hasNext()) {
                        if (obj5 instanceof C28716e) {
                            arrayList5.add(obj5);
                        }
                    }
                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                    if (c28716e7 != null) {
                        sNSStepState = c28716e7.f58403d;
                    } else {
                        sNSStepState = null;
                    }
                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                    if (autoCloseOnApproveTimeout != null) {
                        iIntValue = autoCloseOnApproveTimeout.intValue();
                    } else {
                        iIntValue = 3;
                    }
                    if (sNSStepState == SNSStepState.APPROVED) {
                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                    }
                }
                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                return Unit.INSTANCE;
            case 6:
                abstractC29172p2 = (AbstractC29172p) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                str4 = (String) string11;
                if (str4 != null) {
                    charSequenceM69364a = AbstractC28462i0.m69364a(str4, ((C28547d) this.f66047f).f58099a.f58163a);
                } else {
                    charSequenceM69364a = null;
                }
                c29164n4 = abstractC29172p2.mo69762m().f59168e;
                if (c29164n4 != null) {
                    if (str5.length() == 0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (z13) {
                        str5 = null;
                    }
                    if (str5 == null) {
                    }
                    break;
                }
                c32398g.f66014a = charSequenceM69364a;
                c32398g.f66023j = 7;
                string2 = getString("sns_status_REJECT_subtitle", c32398g);
                if (string2 != coroutine_suspended) {
                    CharSequence charSequence29 = charSequenceM69364a;
                    string11 = string2;
                    charSequence = charSequence29;
                    str6 = (String) string11;
                    if (str6 != null) {
                        Spanned spannedM69364a7 = AbstractC28462i0.m69364a(str6, ((C28547d) this.f66047f).f58099a.f58163a);
                        charSequenceM69364a = charSequence;
                        spannedM69364a4 = spannedM69364a7;
                    } else {
                        charSequenceM69364a = charSequence;
                        spannedM69364a4 = null;
                    }
                    c28716e5 = new C28716e(charSequenceM69364a, spannedM69364a4, SNSStepState.REJECTED);
                    c32398g.f66014a = c28716e5;
                    c32398g.f66023j = 8;
                    string11 = getString("sns_status_REJECT_footerHtml", c32398g);
                    if (string11 != coroutine_suspended) {
                        c28716e6 = c28716e5;
                        c32408q = new C32408Q(c28716e6, (CharSequence) string11, SNSApplicantStatusAnalyticsState.TemporarilyDeclined);
                        abstractC32410T = c32408q;
                        if (abstractC32410T instanceof C32408Q) {
                            List list117 = abstractC32410T.f66068d;
                            arrayList5 = new ArrayList();
                            while (r1.hasNext()) {
                                if (obj5 instanceof C28716e) {
                                    arrayList5.add(obj5);
                                }
                            }
                            c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                            if (c28716e7 != null) {
                                sNSStepState = c28716e7.f58403d;
                            } else {
                                sNSStepState = null;
                            }
                            autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                            if (autoCloseOnApproveTimeout != null) {
                                iIntValue = autoCloseOnApproveTimeout.intValue();
                            } else {
                                iIntValue = 3;
                            }
                            if (sNSStepState == SNSStepState.APPROVED) {
                                AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                            }
                        }
                        AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 7:
                charSequence = (CharSequence) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                i27 = 1;
                str6 = (String) string11;
                if (str6 != null) {
                    Spanned spannedM69364a8 = AbstractC28462i0.m69364a(str6, ((C28547d) this.f66047f).f58099a.f58163a);
                    charSequenceM69364a = charSequence;
                    spannedM69364a4 = spannedM69364a8;
                } else {
                    charSequenceM69364a = charSequence;
                    spannedM69364a4 = null;
                }
                c28716e5 = new C28716e(charSequenceM69364a, spannedM69364a4, SNSStepState.REJECTED);
                c32398g.f66014a = c28716e5;
                c32398g.f66023j = 8;
                string11 = getString("sns_status_REJECT_footerHtml", c32398g);
                if (string11 != coroutine_suspended) {
                    c28716e6 = c28716e5;
                    c32408q = new C32408Q(c28716e6, (CharSequence) string11, SNSApplicantStatusAnalyticsState.TemporarilyDeclined);
                    abstractC32410T = c32408q;
                    if (abstractC32410T instanceof C32408Q) {
                        List list118 = abstractC32410T.f66068d;
                        arrayList5 = new ArrayList();
                        while (r1.hasNext()) {
                            if (obj5 instanceof C28716e) {
                                arrayList5.add(obj5);
                            }
                        }
                        c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                        if (c28716e7 != null) {
                            sNSStepState = c28716e7.f58403d;
                        } else {
                            sNSStepState = null;
                        }
                        autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                        if (autoCloseOnApproveTimeout != null) {
                            iIntValue = autoCloseOnApproveTimeout.intValue();
                        } else {
                            iIntValue = 3;
                        }
                        if (sNSStepState == SNSStepState.APPROVED) {
                            AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                        }
                    }
                    AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 8:
                c28716e6 = (C28716e) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                i27 = 1;
                c32408q = new C32408Q(c28716e6, (CharSequence) string11, SNSApplicantStatusAnalyticsState.TemporarilyDeclined);
                abstractC32410T = c32408q;
                if (abstractC32410T instanceof C32408Q) {
                    List list119 = abstractC32410T.f66068d;
                    arrayList5 = new ArrayList();
                    while (r1.hasNext()) {
                        if (obj5 instanceof C28716e) {
                            arrayList5.add(obj5);
                        }
                    }
                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                    if (c28716e7 != null) {
                        sNSStepState = c28716e7.f58403d;
                    } else {
                        sNSStepState = null;
                    }
                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                    if (autoCloseOnApproveTimeout != null) {
                        iIntValue = autoCloseOnApproveTimeout.intValue();
                    } else {
                        iIntValue = 3;
                    }
                    if (sNSStepState == SNSStepState.APPROVED) {
                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                    }
                }
                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                return Unit.INSTANCE;
            case 9:
                AbstractC29172p abstractC29172p9 = (AbstractC29172p) c32398g.f66015b;
                C28879c c28879c9 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                abstractC29172p = abstractC29172p9;
                c28879c7 = c28879c9;
                charSequence2 = (CharSequence) string11;
                c32398g.f66014a = c28879c7;
                c32398g.f66015b = abstractC29172p;
                c32398g.f66016c = charSequence2;
                c32398g.f66023j = 10;
                string3 = getString("sns_status_REJECT_subtitle", c32398g);
                if (string3 != coroutine_suspended) {
                    c28879c3 = c28879c7;
                    charSequence3 = charSequence2;
                    string11 = string3;
                    charSequence4 = (CharSequence) string11;
                    c32398g.f66014a = c28879c3;
                    c32398g.f66015b = abstractC29172p;
                    c32398g.f66016c = charSequence3;
                    c32398g.f66017d = charSequence4;
                    c32398g.f66023j = 11;
                    string4 = getString("sns_status_REJECT_footerHtml", c32398g);
                    if (string4 != coroutine_suspended) {
                        AbstractC29172p abstractC29172p10 = abstractC29172p;
                        charSequence5 = charSequence3;
                        charSequence6 = charSequence4;
                        string11 = string4;
                        abstractC29172p4 = abstractC29172p10;
                        charSequence7 = (CharSequence) string11;
                        listEmptyList = CollectionsKt.emptyList();
                        c32398g.f66014a = c28879c3;
                        c32398g.f66015b = abstractC29172p4;
                        c32398g.f66016c = charSequence5;
                        c32398g.f66017d = charSequence6;
                        c32398g.f66018e = charSequence7;
                        c32398g.f66019f = listEmptyList;
                        c32398g.f66023j = 12;
                        string5 = getString("sns_status_REJECT_action_continue", c32398g);
                        if (string5 != coroutine_suspended) {
                            charSequence8 = charSequence7;
                            string11 = string5;
                            c28879c4 = c28879c3;
                            abstractC29172p5 = abstractC29172p4;
                            charSequence9 = charSequence6;
                            charSequence10 = charSequence5;
                            list2 = listEmptyList;
                            charSequence11 = (CharSequence) string11;
                            C30336z c30336z2 = this.f66044c;
                            c32398g.f66014a = c28879c4;
                            c32398g.f66015b = abstractC29172p5;
                            c32398g.f66016c = charSequence10;
                            c32398g.f66017d = charSequence9;
                            c32398g.f66018e = charSequence8;
                            c32398g.f66019f = list2;
                            c32398g.f66020g = charSequence11;
                            c32398g.f66023j = 13;
                            objM70193a = c30336z2.m70193a(c32398g);
                            if (objM70193a != coroutine_suspended) {
                                charSequence12 = charSequence10;
                                charSequence13 = charSequence11;
                                string11 = objM70193a;
                                c32405n = new C32405N(charSequence12, charSequence9, charSequence8, list2, charSequence13, ((Boolean) string11).booleanValue(), SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                                arrayListM71114a = m71114a(c28879c4.f58723c, abstractC29172p5);
                                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                                size = arrayListM71114a.size();
                                i11 = 0;
                                while (i11 < size) {
                                    Object obj9 = arrayListM71114a.get(i11);
                                    i11 += i27;
                                    arrayList.add(AbstractC28878b.m69662a(getStrings(), (Document) obj9, ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c4));
                                    i27 = i27;
                                }
                                i27 = i27;
                                arrayList2 = new ArrayList();
                                size2 = arrayList.size();
                                i12 = 0;
                                while (i12 < size2) {
                                    obj4 = arrayList.get(i12);
                                    i12++;
                                    c28713b = (C28713b) obj4;
                                    if (abstractC29172p5.mo69760k().f59152b) {
                                        i26 = 0;
                                    } else {
                                        list5 = abstractC29172p5.mo69760k().f59154d;
                                        if (list5 != null) {
                                            zContains = list5.contains(c28713b.f58397f.f58399b.getType().f59014a);
                                        } else {
                                            zContains = false;
                                        }
                                        if (zContains) {
                                            i26 = i27;
                                        } else {
                                            i26 = 0;
                                        }
                                    }
                                    if (i26 != 0) {
                                        arrayList2.add(obj4);
                                    }
                                }
                                if (arrayList2.isEmpty()) {
                                    i13 = 0;
                                } else {
                                    if (arrayList2.isEmpty()) {
                                        i16 = 0;
                                    } else {
                                        size7 = arrayList2.size();
                                        i25 = 0;
                                        while (true) {
                                            if (i25 < size7) {
                                                obj3 = arrayList2.get(i25);
                                                i25++;
                                                if (!((C28713b) obj3).f58397f.f58399b.isApproved()) {
                                                    i16 = i27;
                                                }
                                            } else {
                                                i16 = 0;
                                            }
                                        }
                                    }
                                    if (i16 == 0) {
                                        i13 = 0;
                                    } else {
                                        if (arrayList2.isEmpty()) {
                                            i17 = i27;
                                        } else {
                                            size6 = arrayList2.size();
                                            i23 = 0;
                                            while (true) {
                                                if (i23 < size6) {
                                                    obj2 = arrayList2.get(i23);
                                                    i23++;
                                                    if (((C28713b) obj2).f58393b == SNSStepState.REJECTED) {
                                                        i24 = i27;
                                                    } else {
                                                        i24 = 0;
                                                    }
                                                    if (i24 == 0) {
                                                        i17 = 0;
                                                    }
                                                } else {
                                                    i17 = i27;
                                                }
                                            }
                                        }
                                        if (i17 == 0) {
                                            i13 = 0;
                                        } else {
                                            if (arrayList2.isEmpty()) {
                                                i18 = i27;
                                            } else {
                                                size5 = arrayList2.size();
                                                i19 = 0;
                                                while (true) {
                                                    if (i19 < size5) {
                                                        Object obj10 = arrayList2.get(i19);
                                                        i19++;
                                                        C28713b c28713b3 = (C28713b) obj10;
                                                        review = c28713b3.f58397f.f58399b.getReview();
                                                        if (review != null) {
                                                            str7 = review.f59159a;
                                                        } else {
                                                            str7 = null;
                                                        }
                                                        if (str7 != null) {
                                                            i21 = i27;
                                                        } else {
                                                            i21 = i27;
                                                        }
                                                        if (i21 == 0) {
                                                            i22 = i27;
                                                        } else {
                                                            i22 = i27;
                                                        }
                                                        if (i22 == 0) {
                                                            i18 = 0;
                                                        }
                                                    } else {
                                                        i18 = i27;
                                                    }
                                                }
                                            }
                                            if (i18 != 0) {
                                                i13 = i27;
                                            } else {
                                                i13 = 0;
                                            }
                                        }
                                    }
                                }
                                if (i13 == 0) {
                                    arrayList2 = null;
                                }
                                if (arrayList2 != null) {
                                    arrayList3 = new ArrayList();
                                    size3 = arrayList.size();
                                    i14 = 0;
                                    while (i14 < size3) {
                                        obj = arrayList.get(i14);
                                        i14++;
                                        if (!arrayList2.contains((C28713b) obj)) {
                                            arrayList3.add(obj);
                                        }
                                    }
                                    mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
                                    arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                                    size4 = arrayList2.size();
                                    i15 = 0;
                                    while (i15 < size4) {
                                        Object obj11 = arrayList2.get(i15);
                                        i15++;
                                        arrayList4.add(((C28713b) obj11).f58397f.f58399b);
                                    }
                                    c32398g.f66014a = abstractC29172p5;
                                    c32398g.f66015b = c32405n;
                                    c32398g.f66016c = c32405n;
                                    c32398g.f66017d = mutableList;
                                    c32398g.f66018e = c32405n;
                                    c32398g.f66019f = mutableList;
                                    c32398g.f66020g = arrayList;
                                    c32398g.f66023j = 14;
                                    objM71118a = m71118a(arrayList4, c32398g);
                                    if (objM71118a != coroutine_suspended) {
                                        string11 = objM71118a;
                                        list3 = arrayList;
                                        c32405n3 = c32405n;
                                        list4 = mutableList;
                                        abstractC29172p6 = abstractC29172p5;
                                        c32405n4 = c32405n3;
                                        list8 = mutableList;
                                        list4.add(string11);
                                        if (list8 != null) {
                                            c32408q = c32405n4;
                                            list7 = list8;
                                        } else {
                                            list6 = list3;
                                            c32405n2 = c32405n;
                                            c32405n = c32405n4;
                                            abstractC29172p5 = abstractC29172p6;
                                        }
                                        c32405n.f66068d = list7;
                                        c29164n5 = abstractC29172p6.mo69762m().f59168e;
                                        if (c29164n5 != null) {
                                            if (StringsKt.isBlank(str8)) {
                                                str8 = null;
                                            }
                                            if (str8 != null) {
                                                List mutableList4 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                                                mutableList4.add(0, new C28715d(str8));
                                                c32405n3.f66068d = mutableList4;
                                                Unit unit3 = Unit.INSTANCE;
                                            }
                                        }
                                        abstractC32410T = c32408q;
                                        if (abstractC32410T instanceof C32408Q) {
                                            List list1110 = abstractC32410T.f66068d;
                                            arrayList5 = new ArrayList();
                                            while (r1.hasNext()) {
                                                if (obj5 instanceof C28716e) {
                                                    arrayList5.add(obj5);
                                                }
                                            }
                                            c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                            if (c28716e7 != null) {
                                                sNSStepState = c28716e7.f58403d;
                                            } else {
                                                sNSStepState = null;
                                            }
                                            autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                            if (autoCloseOnApproveTimeout != null) {
                                                iIntValue = autoCloseOnApproveTimeout.intValue();
                                            } else {
                                                iIntValue = 3;
                                            }
                                            if (sNSStepState == SNSStepState.APPROVED) {
                                                AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                            }
                                        }
                                        AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                        return Unit.INSTANCE;
                                    }
                                } else {
                                    c32405n2 = c32405n;
                                    c32405n3 = c32405n2;
                                    list6 = arrayList;
                                }
                                list7 = list6;
                                c32408q = c32405n;
                                abstractC29172p6 = abstractC29172p5;
                                c32405n = c32405n2;
                                c32405n.f66068d = list7;
                                c29164n5 = abstractC29172p6.mo69762m().f59168e;
                                if (c29164n5 != null) {
                                    if (StringsKt.isBlank(str8)) {
                                        str8 = null;
                                    }
                                    if (str8 != null) {
                                        List mutableList5 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                                        mutableList5.add(0, new C28715d(str8));
                                        c32405n3.f66068d = mutableList5;
                                        Unit unit4 = Unit.INSTANCE;
                                    }
                                }
                                abstractC32410T = c32408q;
                                if (abstractC32410T instanceof C32408Q) {
                                    List list1111 = abstractC32410T.f66068d;
                                    arrayList5 = new ArrayList();
                                    while (r1.hasNext()) {
                                        if (obj5 instanceof C28716e) {
                                            arrayList5.add(obj5);
                                        }
                                    }
                                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                    if (c28716e7 != null) {
                                        sNSStepState = c28716e7.f58403d;
                                    } else {
                                        sNSStepState = null;
                                    }
                                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                    if (autoCloseOnApproveTimeout != null) {
                                        iIntValue = autoCloseOnApproveTimeout.intValue();
                                    } else {
                                        iIntValue = 3;
                                    }
                                    if (sNSStepState == SNSStepState.APPROVED) {
                                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                    }
                                }
                                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                return Unit.INSTANCE;
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 10:
                charSequence3 = (CharSequence) c32398g.f66016c;
                abstractC29172p = (AbstractC29172p) c32398g.f66015b;
                C28879c c28879c10 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                c28879c3 = c28879c10;
                charSequence4 = (CharSequence) string11;
                c32398g.f66014a = c28879c3;
                c32398g.f66015b = abstractC29172p;
                c32398g.f66016c = charSequence3;
                c32398g.f66017d = charSequence4;
                c32398g.f66023j = 11;
                string4 = getString("sns_status_REJECT_footerHtml", c32398g);
                if (string4 != coroutine_suspended) {
                    AbstractC29172p abstractC29172p11 = abstractC29172p;
                    charSequence5 = charSequence3;
                    charSequence6 = charSequence4;
                    string11 = string4;
                    abstractC29172p4 = abstractC29172p11;
                    charSequence7 = (CharSequence) string11;
                    listEmptyList = CollectionsKt.emptyList();
                    c32398g.f66014a = c28879c3;
                    c32398g.f66015b = abstractC29172p4;
                    c32398g.f66016c = charSequence5;
                    c32398g.f66017d = charSequence6;
                    c32398g.f66018e = charSequence7;
                    c32398g.f66019f = listEmptyList;
                    c32398g.f66023j = 12;
                    string5 = getString("sns_status_REJECT_action_continue", c32398g);
                    if (string5 != coroutine_suspended) {
                        charSequence8 = charSequence7;
                        string11 = string5;
                        c28879c4 = c28879c3;
                        abstractC29172p5 = abstractC29172p4;
                        charSequence9 = charSequence6;
                        charSequence10 = charSequence5;
                        list2 = listEmptyList;
                        charSequence11 = (CharSequence) string11;
                        C30336z c30336z3 = this.f66044c;
                        c32398g.f66014a = c28879c4;
                        c32398g.f66015b = abstractC29172p5;
                        c32398g.f66016c = charSequence10;
                        c32398g.f66017d = charSequence9;
                        c32398g.f66018e = charSequence8;
                        c32398g.f66019f = list2;
                        c32398g.f66020g = charSequence11;
                        c32398g.f66023j = 13;
                        objM70193a = c30336z3.m70193a(c32398g);
                        if (objM70193a != coroutine_suspended) {
                            charSequence12 = charSequence10;
                            charSequence13 = charSequence11;
                            string11 = objM70193a;
                            c32405n = new C32405N(charSequence12, charSequence9, charSequence8, list2, charSequence13, ((Boolean) string11).booleanValue(), SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                            arrayListM71114a = m71114a(c28879c4.f58723c, abstractC29172p5);
                            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                            size = arrayListM71114a.size();
                            i11 = 0;
                            while (i11 < size) {
                                Object obj12 = arrayListM71114a.get(i11);
                                i11 += i27;
                                arrayList.add(AbstractC28878b.m69662a(getStrings(), (Document) obj12, ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c4));
                                i27 = i27;
                            }
                            i27 = i27;
                            arrayList2 = new ArrayList();
                            size2 = arrayList.size();
                            i12 = 0;
                            while (i12 < size2) {
                                obj4 = arrayList.get(i12);
                                i12++;
                                c28713b = (C28713b) obj4;
                                if (abstractC29172p5.mo69760k().f59152b) {
                                    i26 = 0;
                                } else {
                                    list5 = abstractC29172p5.mo69760k().f59154d;
                                    if (list5 != null) {
                                        zContains = list5.contains(c28713b.f58397f.f58399b.getType().f59014a);
                                    } else {
                                        zContains = false;
                                    }
                                    if (zContains) {
                                        i26 = i27;
                                    } else {
                                        i26 = 0;
                                    }
                                }
                                if (i26 != 0) {
                                    arrayList2.add(obj4);
                                }
                            }
                            if (arrayList2.isEmpty()) {
                                i13 = 0;
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i16 = 0;
                                } else {
                                    size7 = arrayList2.size();
                                    i25 = 0;
                                    while (true) {
                                        if (i25 < size7) {
                                            obj3 = arrayList2.get(i25);
                                            i25++;
                                            if (!((C28713b) obj3).f58397f.f58399b.isApproved()) {
                                                i16 = i27;
                                            }
                                        } else {
                                            i16 = 0;
                                        }
                                    }
                                }
                                if (i16 == 0) {
                                    i13 = 0;
                                } else {
                                    if (arrayList2.isEmpty()) {
                                        i17 = i27;
                                    } else {
                                        size6 = arrayList2.size();
                                        i23 = 0;
                                        while (true) {
                                            if (i23 < size6) {
                                                obj2 = arrayList2.get(i23);
                                                i23++;
                                                if (((C28713b) obj2).f58393b == SNSStepState.REJECTED) {
                                                    i24 = i27;
                                                } else {
                                                    i24 = 0;
                                                }
                                                if (i24 == 0) {
                                                    i17 = 0;
                                                }
                                            } else {
                                                i17 = i27;
                                            }
                                        }
                                    }
                                    if (i17 == 0) {
                                        i13 = 0;
                                    } else {
                                        if (arrayList2.isEmpty()) {
                                            i18 = i27;
                                        } else {
                                            size5 = arrayList2.size();
                                            i19 = 0;
                                            while (true) {
                                                if (i19 < size5) {
                                                    Object obj13 = arrayList2.get(i19);
                                                    i19++;
                                                    C28713b c28713b4 = (C28713b) obj13;
                                                    review = c28713b4.f58397f.f58399b.getReview();
                                                    if (review != null) {
                                                        str7 = review.f59159a;
                                                    } else {
                                                        str7 = null;
                                                    }
                                                    if (str7 != null) {
                                                        i21 = i27;
                                                    } else {
                                                        i21 = i27;
                                                    }
                                                    if (i21 == 0) {
                                                        i22 = i27;
                                                    } else {
                                                        i22 = i27;
                                                    }
                                                    if (i22 == 0) {
                                                        i18 = 0;
                                                    }
                                                } else {
                                                    i18 = i27;
                                                }
                                            }
                                        }
                                        if (i18 != 0) {
                                            i13 = i27;
                                        } else {
                                            i13 = 0;
                                        }
                                    }
                                }
                            }
                            if (i13 == 0) {
                                arrayList2 = null;
                            }
                            if (arrayList2 != null) {
                                arrayList3 = new ArrayList();
                                size3 = arrayList.size();
                                i14 = 0;
                                while (i14 < size3) {
                                    obj = arrayList.get(i14);
                                    i14++;
                                    if (!arrayList2.contains((C28713b) obj)) {
                                        arrayList3.add(obj);
                                    }
                                }
                                mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
                                arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                                size4 = arrayList2.size();
                                i15 = 0;
                                while (i15 < size4) {
                                    Object obj14 = arrayList2.get(i15);
                                    i15++;
                                    arrayList4.add(((C28713b) obj14).f58397f.f58399b);
                                }
                                c32398g.f66014a = abstractC29172p5;
                                c32398g.f66015b = c32405n;
                                c32398g.f66016c = c32405n;
                                c32398g.f66017d = mutableList;
                                c32398g.f66018e = c32405n;
                                c32398g.f66019f = mutableList;
                                c32398g.f66020g = arrayList;
                                c32398g.f66023j = 14;
                                objM71118a = m71118a(arrayList4, c32398g);
                                if (objM71118a != coroutine_suspended) {
                                    string11 = objM71118a;
                                    list3 = arrayList;
                                    c32405n3 = c32405n;
                                    list4 = mutableList;
                                    abstractC29172p6 = abstractC29172p5;
                                    c32405n4 = c32405n3;
                                    list8 = mutableList;
                                    list4.add(string11);
                                    if (list8 != null) {
                                        c32408q = c32405n4;
                                        list7 = list8;
                                    } else {
                                        list6 = list3;
                                        c32405n2 = c32405n;
                                        c32405n = c32405n4;
                                        abstractC29172p5 = abstractC29172p6;
                                    }
                                    c32405n.f66068d = list7;
                                    c29164n5 = abstractC29172p6.mo69762m().f59168e;
                                    if (c29164n5 != null) {
                                        if (StringsKt.isBlank(str8)) {
                                            str8 = null;
                                        }
                                        if (str8 != null) {
                                            List mutableList6 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                                            mutableList6.add(0, new C28715d(str8));
                                            c32405n3.f66068d = mutableList6;
                                            Unit unit5 = Unit.INSTANCE;
                                        }
                                    }
                                    abstractC32410T = c32408q;
                                    if (abstractC32410T instanceof C32408Q) {
                                        List list1112 = abstractC32410T.f66068d;
                                        arrayList5 = new ArrayList();
                                        while (r1.hasNext()) {
                                            if (obj5 instanceof C28716e) {
                                                arrayList5.add(obj5);
                                            }
                                        }
                                        c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                        if (c28716e7 != null) {
                                            sNSStepState = c28716e7.f58403d;
                                        } else {
                                            sNSStepState = null;
                                        }
                                        autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                        if (autoCloseOnApproveTimeout != null) {
                                            iIntValue = autoCloseOnApproveTimeout.intValue();
                                        } else {
                                            iIntValue = 3;
                                        }
                                        if (sNSStepState == SNSStepState.APPROVED) {
                                            AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                        }
                                    }
                                    AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                    return Unit.INSTANCE;
                                }
                            } else {
                                c32405n2 = c32405n;
                                c32405n3 = c32405n2;
                                list6 = arrayList;
                            }
                            list7 = list6;
                            c32408q = c32405n;
                            abstractC29172p6 = abstractC29172p5;
                            c32405n = c32405n2;
                            c32405n.f66068d = list7;
                            c29164n5 = abstractC29172p6.mo69762m().f59168e;
                            if (c29164n5 != null) {
                                if (StringsKt.isBlank(str8)) {
                                    str8 = null;
                                }
                                if (str8 != null) {
                                    List mutableList7 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                                    mutableList7.add(0, new C28715d(str8));
                                    c32405n3.f66068d = mutableList7;
                                    Unit unit6 = Unit.INSTANCE;
                                }
                            }
                            abstractC32410T = c32408q;
                            if (abstractC32410T instanceof C32408Q) {
                                List list1113 = abstractC32410T.f66068d;
                                arrayList5 = new ArrayList();
                                while (r1.hasNext()) {
                                    if (obj5 instanceof C28716e) {
                                        arrayList5.add(obj5);
                                    }
                                }
                                c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                if (c28716e7 != null) {
                                    sNSStepState = c28716e7.f58403d;
                                } else {
                                    sNSStepState = null;
                                }
                                autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                if (autoCloseOnApproveTimeout != null) {
                                    iIntValue = autoCloseOnApproveTimeout.intValue();
                                } else {
                                    iIntValue = 3;
                                }
                                if (sNSStepState == SNSStepState.APPROVED) {
                                    AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                }
                            }
                            AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            case 11:
                charSequence6 = (CharSequence) c32398g.f66017d;
                charSequence5 = (CharSequence) c32398g.f66016c;
                abstractC29172p4 = (AbstractC29172p) c32398g.f66015b;
                c28879c3 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                charSequence7 = (CharSequence) string11;
                listEmptyList = CollectionsKt.emptyList();
                c32398g.f66014a = c28879c3;
                c32398g.f66015b = abstractC29172p4;
                c32398g.f66016c = charSequence5;
                c32398g.f66017d = charSequence6;
                c32398g.f66018e = charSequence7;
                c32398g.f66019f = listEmptyList;
                c32398g.f66023j = 12;
                string5 = getString("sns_status_REJECT_action_continue", c32398g);
                if (string5 != coroutine_suspended) {
                    charSequence8 = charSequence7;
                    string11 = string5;
                    c28879c4 = c28879c3;
                    abstractC29172p5 = abstractC29172p4;
                    charSequence9 = charSequence6;
                    charSequence10 = charSequence5;
                    list2 = listEmptyList;
                    charSequence11 = (CharSequence) string11;
                    C30336z c30336z4 = this.f66044c;
                    c32398g.f66014a = c28879c4;
                    c32398g.f66015b = abstractC29172p5;
                    c32398g.f66016c = charSequence10;
                    c32398g.f66017d = charSequence9;
                    c32398g.f66018e = charSequence8;
                    c32398g.f66019f = list2;
                    c32398g.f66020g = charSequence11;
                    c32398g.f66023j = 13;
                    objM70193a = c30336z4.m70193a(c32398g);
                    if (objM70193a != coroutine_suspended) {
                        charSequence12 = charSequence10;
                        charSequence13 = charSequence11;
                        string11 = objM70193a;
                        c32405n = new C32405N(charSequence12, charSequence9, charSequence8, list2, charSequence13, ((Boolean) string11).booleanValue(), SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                        arrayListM71114a = m71114a(c28879c4.f58723c, abstractC29172p5);
                        arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                        size = arrayListM71114a.size();
                        i11 = 0;
                        while (i11 < size) {
                            Object obj15 = arrayListM71114a.get(i11);
                            i11 += i27;
                            arrayList.add(AbstractC28878b.m69662a(getStrings(), (Document) obj15, ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c4));
                            i27 = i27;
                        }
                        i27 = i27;
                        arrayList2 = new ArrayList();
                        size2 = arrayList.size();
                        i12 = 0;
                        while (i12 < size2) {
                            obj4 = arrayList.get(i12);
                            i12++;
                            c28713b = (C28713b) obj4;
                            if (abstractC29172p5.mo69760k().f59152b) {
                                i26 = 0;
                            } else {
                                list5 = abstractC29172p5.mo69760k().f59154d;
                                if (list5 != null) {
                                    zContains = list5.contains(c28713b.f58397f.f58399b.getType().f59014a);
                                } else {
                                    zContains = false;
                                }
                                if (zContains) {
                                    i26 = i27;
                                } else {
                                    i26 = 0;
                                }
                            }
                            if (i26 != 0) {
                                arrayList2.add(obj4);
                            }
                        }
                        if (arrayList2.isEmpty()) {
                            i13 = 0;
                        } else {
                            if (arrayList2.isEmpty()) {
                                i16 = 0;
                            } else {
                                size7 = arrayList2.size();
                                i25 = 0;
                                while (true) {
                                    if (i25 < size7) {
                                        obj3 = arrayList2.get(i25);
                                        i25++;
                                        if (!((C28713b) obj3).f58397f.f58399b.isApproved()) {
                                            i16 = i27;
                                        }
                                    } else {
                                        i16 = 0;
                                    }
                                }
                            }
                            if (i16 == 0) {
                                i13 = 0;
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i17 = i27;
                                } else {
                                    size6 = arrayList2.size();
                                    i23 = 0;
                                    while (true) {
                                        if (i23 < size6) {
                                            obj2 = arrayList2.get(i23);
                                            i23++;
                                            if (((C28713b) obj2).f58393b == SNSStepState.REJECTED) {
                                                i24 = i27;
                                            } else {
                                                i24 = 0;
                                            }
                                            if (i24 == 0) {
                                                i17 = 0;
                                            }
                                        } else {
                                            i17 = i27;
                                        }
                                    }
                                }
                                if (i17 == 0) {
                                    i13 = 0;
                                } else {
                                    if (arrayList2.isEmpty()) {
                                        i18 = i27;
                                    } else {
                                        size5 = arrayList2.size();
                                        i19 = 0;
                                        while (true) {
                                            if (i19 < size5) {
                                                Object obj16 = arrayList2.get(i19);
                                                i19++;
                                                C28713b c28713b5 = (C28713b) obj16;
                                                review = c28713b5.f58397f.f58399b.getReview();
                                                if (review != null) {
                                                    str7 = review.f59159a;
                                                } else {
                                                    str7 = null;
                                                }
                                                if (str7 != null) {
                                                    i21 = i27;
                                                } else {
                                                    i21 = i27;
                                                }
                                                if (i21 == 0) {
                                                    i22 = i27;
                                                } else {
                                                    i22 = i27;
                                                }
                                                if (i22 == 0) {
                                                    i18 = 0;
                                                }
                                            } else {
                                                i18 = i27;
                                            }
                                        }
                                    }
                                    if (i18 != 0) {
                                        i13 = i27;
                                    } else {
                                        i13 = 0;
                                    }
                                }
                            }
                        }
                        if (i13 == 0) {
                            arrayList2 = null;
                        }
                        if (arrayList2 != null) {
                            arrayList3 = new ArrayList();
                            size3 = arrayList.size();
                            i14 = 0;
                            while (i14 < size3) {
                                obj = arrayList.get(i14);
                                i14++;
                                if (!arrayList2.contains((C28713b) obj)) {
                                    arrayList3.add(obj);
                                }
                            }
                            mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
                            arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                            size4 = arrayList2.size();
                            i15 = 0;
                            while (i15 < size4) {
                                Object obj17 = arrayList2.get(i15);
                                i15++;
                                arrayList4.add(((C28713b) obj17).f58397f.f58399b);
                            }
                            c32398g.f66014a = abstractC29172p5;
                            c32398g.f66015b = c32405n;
                            c32398g.f66016c = c32405n;
                            c32398g.f66017d = mutableList;
                            c32398g.f66018e = c32405n;
                            c32398g.f66019f = mutableList;
                            c32398g.f66020g = arrayList;
                            c32398g.f66023j = 14;
                            objM71118a = m71118a(arrayList4, c32398g);
                            if (objM71118a != coroutine_suspended) {
                                string11 = objM71118a;
                                list3 = arrayList;
                                c32405n3 = c32405n;
                                list4 = mutableList;
                                abstractC29172p6 = abstractC29172p5;
                                c32405n4 = c32405n3;
                                list8 = mutableList;
                                list4.add(string11);
                                if (list8 != null) {
                                    c32408q = c32405n4;
                                    list7 = list8;
                                } else {
                                    list6 = list3;
                                    c32405n2 = c32405n;
                                    c32405n = c32405n4;
                                    abstractC29172p5 = abstractC29172p6;
                                }
                                c32405n.f66068d = list7;
                                c29164n5 = abstractC29172p6.mo69762m().f59168e;
                                if (c29164n5 != null) {
                                    if (StringsKt.isBlank(str8)) {
                                        str8 = null;
                                    }
                                    if (str8 != null) {
                                        List mutableList8 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                                        mutableList8.add(0, new C28715d(str8));
                                        c32405n3.f66068d = mutableList8;
                                        Unit unit7 = Unit.INSTANCE;
                                    }
                                }
                                abstractC32410T = c32408q;
                                if (abstractC32410T instanceof C32408Q) {
                                    List list1114 = abstractC32410T.f66068d;
                                    arrayList5 = new ArrayList();
                                    while (r1.hasNext()) {
                                        if (obj5 instanceof C28716e) {
                                            arrayList5.add(obj5);
                                        }
                                    }
                                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                    if (c28716e7 != null) {
                                        sNSStepState = c28716e7.f58403d;
                                    } else {
                                        sNSStepState = null;
                                    }
                                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                    if (autoCloseOnApproveTimeout != null) {
                                        iIntValue = autoCloseOnApproveTimeout.intValue();
                                    } else {
                                        iIntValue = 3;
                                    }
                                    if (sNSStepState == SNSStepState.APPROVED) {
                                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                    }
                                }
                                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                                return Unit.INSTANCE;
                            }
                        } else {
                            c32405n2 = c32405n;
                            c32405n3 = c32405n2;
                            list6 = arrayList;
                        }
                        list7 = list6;
                        c32408q = c32405n;
                        abstractC29172p6 = abstractC29172p5;
                        c32405n = c32405n2;
                        c32405n.f66068d = list7;
                        c29164n5 = abstractC29172p6.mo69762m().f59168e;
                        if (c29164n5 != null) {
                            if (StringsKt.isBlank(str8)) {
                                str8 = null;
                            }
                            if (str8 != null) {
                                List mutableList9 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                                mutableList9.add(0, new C28715d(str8));
                                c32405n3.f66068d = mutableList9;
                                Unit unit8 = Unit.INSTANCE;
                            }
                        }
                        abstractC32410T = c32408q;
                        if (abstractC32410T instanceof C32408Q) {
                            List list1115 = abstractC32410T.f66068d;
                            arrayList5 = new ArrayList();
                            while (r1.hasNext()) {
                                if (obj5 instanceof C28716e) {
                                    arrayList5.add(obj5);
                                }
                            }
                            c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                            if (c28716e7 != null) {
                                sNSStepState = c28716e7.f58403d;
                            } else {
                                sNSStepState = null;
                            }
                            autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                            if (autoCloseOnApproveTimeout != null) {
                                iIntValue = autoCloseOnApproveTimeout.intValue();
                            } else {
                                iIntValue = 3;
                            }
                            if (sNSStepState == SNSStepState.APPROVED) {
                                AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                            }
                        }
                        AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 12:
                List list21 = c32398g.f66019f;
                CharSequence charSequence30 = (CharSequence) c32398g.f66018e;
                CharSequence charSequence31 = (CharSequence) c32398g.f66017d;
                CharSequence charSequence32 = (CharSequence) c32398g.f66016c;
                abstractC29172p5 = (AbstractC29172p) c32398g.f66015b;
                C28879c c28879c11 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                list2 = list21;
                charSequence10 = charSequence32;
                charSequence9 = charSequence31;
                charSequence8 = charSequence30;
                c28879c4 = c28879c11;
                charSequence11 = (CharSequence) string11;
                C30336z c30336z5 = this.f66044c;
                c32398g.f66014a = c28879c4;
                c32398g.f66015b = abstractC29172p5;
                c32398g.f66016c = charSequence10;
                c32398g.f66017d = charSequence9;
                c32398g.f66018e = charSequence8;
                c32398g.f66019f = list2;
                c32398g.f66020g = charSequence11;
                c32398g.f66023j = 13;
                objM70193a = c30336z5.m70193a(c32398g);
                if (objM70193a != coroutine_suspended) {
                    charSequence12 = charSequence10;
                    charSequence13 = charSequence11;
                    string11 = objM70193a;
                    c32405n = new C32405N(charSequence12, charSequence9, charSequence8, list2, charSequence13, ((Boolean) string11).booleanValue(), SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                    arrayListM71114a = m71114a(c28879c4.f58723c, abstractC29172p5);
                    arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                    size = arrayListM71114a.size();
                    i11 = 0;
                    while (i11 < size) {
                        Object obj18 = arrayListM71114a.get(i11);
                        i11 += i27;
                        arrayList.add(AbstractC28878b.m69662a(getStrings(), (Document) obj18, ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c4));
                        i27 = i27;
                    }
                    i27 = i27;
                    arrayList2 = new ArrayList();
                    size2 = arrayList.size();
                    i12 = 0;
                    while (i12 < size2) {
                        obj4 = arrayList.get(i12);
                        i12++;
                        c28713b = (C28713b) obj4;
                        if (abstractC29172p5.mo69760k().f59152b) {
                            i26 = 0;
                        } else {
                            list5 = abstractC29172p5.mo69760k().f59154d;
                            if (list5 != null) {
                                zContains = list5.contains(c28713b.f58397f.f58399b.getType().f59014a);
                            } else {
                                zContains = false;
                            }
                            if (zContains) {
                                i26 = i27;
                            } else {
                                i26 = 0;
                            }
                        }
                        if (i26 != 0) {
                            arrayList2.add(obj4);
                        }
                    }
                    if (arrayList2.isEmpty()) {
                        i13 = 0;
                    } else {
                        if (arrayList2.isEmpty()) {
                            i16 = 0;
                        } else {
                            size7 = arrayList2.size();
                            i25 = 0;
                            while (true) {
                                if (i25 < size7) {
                                    obj3 = arrayList2.get(i25);
                                    i25++;
                                    if (!((C28713b) obj3).f58397f.f58399b.isApproved()) {
                                        i16 = i27;
                                    }
                                } else {
                                    i16 = 0;
                                }
                            }
                        }
                        if (i16 == 0) {
                            i13 = 0;
                        } else {
                            if (arrayList2.isEmpty()) {
                                i17 = i27;
                            } else {
                                size6 = arrayList2.size();
                                i23 = 0;
                                while (true) {
                                    if (i23 < size6) {
                                        obj2 = arrayList2.get(i23);
                                        i23++;
                                        if (((C28713b) obj2).f58393b == SNSStepState.REJECTED) {
                                            i24 = i27;
                                        } else {
                                            i24 = 0;
                                        }
                                        if (i24 == 0) {
                                            i17 = 0;
                                        }
                                    } else {
                                        i17 = i27;
                                    }
                                }
                            }
                            if (i17 == 0) {
                                i13 = 0;
                            } else {
                                if (arrayList2.isEmpty()) {
                                    i18 = i27;
                                } else {
                                    size5 = arrayList2.size();
                                    i19 = 0;
                                    while (true) {
                                        if (i19 < size5) {
                                            Object obj19 = arrayList2.get(i19);
                                            i19++;
                                            C28713b c28713b6 = (C28713b) obj19;
                                            review = c28713b6.f58397f.f58399b.getReview();
                                            if (review != null) {
                                                str7 = review.f59159a;
                                            } else {
                                                str7 = null;
                                            }
                                            if (str7 != null) {
                                                i21 = i27;
                                            } else {
                                                i21 = i27;
                                            }
                                            if (i21 == 0) {
                                                i22 = i27;
                                            } else {
                                                i22 = i27;
                                            }
                                            if (i22 == 0) {
                                                i18 = 0;
                                            }
                                        } else {
                                            i18 = i27;
                                        }
                                    }
                                }
                                if (i18 != 0) {
                                    i13 = i27;
                                } else {
                                    i13 = 0;
                                }
                            }
                        }
                    }
                    if (i13 == 0) {
                        arrayList2 = null;
                    }
                    if (arrayList2 != null) {
                        arrayList3 = new ArrayList();
                        size3 = arrayList.size();
                        i14 = 0;
                        while (i14 < size3) {
                            obj = arrayList.get(i14);
                            i14++;
                            if (!arrayList2.contains((C28713b) obj)) {
                                arrayList3.add(obj);
                            }
                        }
                        mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
                        arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                        size4 = arrayList2.size();
                        i15 = 0;
                        while (i15 < size4) {
                            Object obj110 = arrayList2.get(i15);
                            i15++;
                            arrayList4.add(((C28713b) obj110).f58397f.f58399b);
                        }
                        c32398g.f66014a = abstractC29172p5;
                        c32398g.f66015b = c32405n;
                        c32398g.f66016c = c32405n;
                        c32398g.f66017d = mutableList;
                        c32398g.f66018e = c32405n;
                        c32398g.f66019f = mutableList;
                        c32398g.f66020g = arrayList;
                        c32398g.f66023j = 14;
                        objM71118a = m71118a(arrayList4, c32398g);
                        if (objM71118a != coroutine_suspended) {
                            string11 = objM71118a;
                            list3 = arrayList;
                            c32405n3 = c32405n;
                            list4 = mutableList;
                            abstractC29172p6 = abstractC29172p5;
                            c32405n4 = c32405n3;
                            list8 = mutableList;
                            list4.add(string11);
                            if (list8 != null) {
                                c32408q = c32405n4;
                                list7 = list8;
                            } else {
                                list6 = list3;
                                c32405n2 = c32405n;
                                c32405n = c32405n4;
                                abstractC29172p5 = abstractC29172p6;
                            }
                            c32405n.f66068d = list7;
                            c29164n5 = abstractC29172p6.mo69762m().f59168e;
                            if (c29164n5 != null) {
                                if (StringsKt.isBlank(str8)) {
                                    str8 = null;
                                }
                                if (str8 != null) {
                                    List mutableList10 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                                    mutableList10.add(0, new C28715d(str8));
                                    c32405n3.f66068d = mutableList10;
                                    Unit unit9 = Unit.INSTANCE;
                                }
                            }
                            abstractC32410T = c32408q;
                            if (abstractC32410T instanceof C32408Q) {
                                List list1116 = abstractC32410T.f66068d;
                                arrayList5 = new ArrayList();
                                while (r1.hasNext()) {
                                    if (obj5 instanceof C28716e) {
                                        arrayList5.add(obj5);
                                    }
                                }
                                c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                if (c28716e7 != null) {
                                    sNSStepState = c28716e7.f58403d;
                                } else {
                                    sNSStepState = null;
                                }
                                autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                if (autoCloseOnApproveTimeout != null) {
                                    iIntValue = autoCloseOnApproveTimeout.intValue();
                                } else {
                                    iIntValue = 3;
                                }
                                if (sNSStepState == SNSStepState.APPROVED) {
                                    AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                }
                            }
                            AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                            return Unit.INSTANCE;
                        }
                    } else {
                        c32405n2 = c32405n;
                        c32405n3 = c32405n2;
                        list6 = arrayList;
                    }
                    list7 = list6;
                    c32408q = c32405n;
                    abstractC29172p6 = abstractC29172p5;
                    c32405n = c32405n2;
                    c32405n.f66068d = list7;
                    c29164n5 = abstractC29172p6.mo69762m().f59168e;
                    if (c29164n5 != null) {
                        if (StringsKt.isBlank(str8)) {
                            str8 = null;
                        }
                        if (str8 != null) {
                            List mutableList11 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                            mutableList11.add(0, new C28715d(str8));
                            c32405n3.f66068d = mutableList11;
                            Unit unit10 = Unit.INSTANCE;
                        }
                    }
                    abstractC32410T = c32408q;
                    if (abstractC32410T instanceof C32408Q) {
                        List list1117 = abstractC32410T.f66068d;
                        arrayList5 = new ArrayList();
                        while (r1.hasNext()) {
                            if (obj5 instanceof C28716e) {
                                arrayList5.add(obj5);
                            }
                        }
                        c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                        if (c28716e7 != null) {
                            sNSStepState = c28716e7.f58403d;
                        } else {
                            sNSStepState = null;
                        }
                        autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                        if (autoCloseOnApproveTimeout != null) {
                            iIntValue = autoCloseOnApproveTimeout.intValue();
                        } else {
                            iIntValue = 3;
                        }
                        if (sNSStepState == SNSStepState.APPROVED) {
                            AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                        }
                    }
                    AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 13:
                CharSequence charSequence33 = (CharSequence) c32398g.f66020g;
                list2 = c32398g.f66019f;
                charSequence8 = (CharSequence) c32398g.f66018e;
                charSequence9 = (CharSequence) c32398g.f66017d;
                CharSequence charSequence34 = (CharSequence) c32398g.f66016c;
                AbstractC29172p abstractC29172p12 = (AbstractC29172p) c32398g.f66015b;
                c28879c4 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                charSequence13 = charSequence33;
                charSequence12 = charSequence34;
                abstractC29172p5 = abstractC29172p12;
                c32405n = new C32405N(charSequence12, charSequence9, charSequence8, list2, charSequence13, ((Boolean) string11).booleanValue(), SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                arrayListM71114a = m71114a(c28879c4.f58723c, abstractC29172p5);
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayListM71114a, 10));
                size = arrayListM71114a.size();
                i11 = 0;
                while (i11 < size) {
                    Object obj111 = arrayListM71114a.get(i11);
                    i11 += i27;
                    arrayList.add(AbstractC28878b.m69662a(getStrings(), (Document) obj111, ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c4));
                    i27 = i27;
                }
                i27 = i27;
                arrayList2 = new ArrayList();
                size2 = arrayList.size();
                i12 = 0;
                while (i12 < size2) {
                    obj4 = arrayList.get(i12);
                    i12++;
                    c28713b = (C28713b) obj4;
                    if (abstractC29172p5.mo69760k().f59152b) {
                        i26 = 0;
                    } else {
                        list5 = abstractC29172p5.mo69760k().f59154d;
                        if (list5 != null) {
                            zContains = list5.contains(c28713b.f58397f.f58399b.getType().f59014a);
                        } else {
                            zContains = false;
                        }
                        if (zContains) {
                            i26 = i27;
                        } else {
                            i26 = 0;
                        }
                    }
                    if (i26 != 0) {
                        arrayList2.add(obj4);
                    }
                }
                if (arrayList2.isEmpty()) {
                    i13 = 0;
                } else {
                    if (arrayList2.isEmpty()) {
                        i16 = 0;
                    } else {
                        size7 = arrayList2.size();
                        i25 = 0;
                        while (true) {
                            if (i25 < size7) {
                                obj3 = arrayList2.get(i25);
                                i25++;
                                if (!((C28713b) obj3).f58397f.f58399b.isApproved()) {
                                    i16 = i27;
                                }
                            } else {
                                i16 = 0;
                            }
                        }
                    }
                    if (i16 == 0) {
                        i13 = 0;
                    } else {
                        if (arrayList2.isEmpty()) {
                            i17 = i27;
                        } else {
                            size6 = arrayList2.size();
                            i23 = 0;
                            while (true) {
                                if (i23 < size6) {
                                    obj2 = arrayList2.get(i23);
                                    i23++;
                                    if (((C28713b) obj2).f58393b == SNSStepState.REJECTED) {
                                        i24 = i27;
                                    } else {
                                        i24 = 0;
                                    }
                                    if (i24 == 0) {
                                        i17 = 0;
                                    }
                                } else {
                                    i17 = i27;
                                }
                            }
                        }
                        if (i17 == 0) {
                            i13 = 0;
                        } else {
                            if (arrayList2.isEmpty()) {
                                i18 = i27;
                            } else {
                                size5 = arrayList2.size();
                                i19 = 0;
                                while (true) {
                                    if (i19 < size5) {
                                        Object obj112 = arrayList2.get(i19);
                                        i19++;
                                        C28713b c28713b7 = (C28713b) obj112;
                                        review = c28713b7.f58397f.f58399b.getReview();
                                        if (review != null) {
                                            str7 = review.f59159a;
                                        } else {
                                            str7 = null;
                                        }
                                        if (str7 != null) {
                                            i21 = i27;
                                        } else {
                                            i21 = i27;
                                        }
                                        if (i21 == 0) {
                                            i22 = i27;
                                        } else {
                                            i22 = i27;
                                        }
                                        if (i22 == 0) {
                                            i18 = 0;
                                        }
                                    } else {
                                        i18 = i27;
                                    }
                                }
                            }
                            if (i18 != 0) {
                                i13 = i27;
                            } else {
                                i13 = 0;
                            }
                        }
                    }
                }
                if (i13 == 0) {
                    arrayList2 = null;
                }
                if (arrayList2 != null) {
                    arrayList3 = new ArrayList();
                    size3 = arrayList.size();
                    i14 = 0;
                    while (i14 < size3) {
                        obj = arrayList.get(i14);
                        i14++;
                        if (!arrayList2.contains((C28713b) obj)) {
                            arrayList3.add(obj);
                        }
                    }
                    mutableList = CollectionsKt.toMutableList((Collection) arrayList3);
                    arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    size4 = arrayList2.size();
                    i15 = 0;
                    while (i15 < size4) {
                        Object obj113 = arrayList2.get(i15);
                        i15++;
                        arrayList4.add(((C28713b) obj113).f58397f.f58399b);
                    }
                    c32398g.f66014a = abstractC29172p5;
                    c32398g.f66015b = c32405n;
                    c32398g.f66016c = c32405n;
                    c32398g.f66017d = mutableList;
                    c32398g.f66018e = c32405n;
                    c32398g.f66019f = mutableList;
                    c32398g.f66020g = arrayList;
                    c32398g.f66023j = 14;
                    objM71118a = m71118a(arrayList4, c32398g);
                    if (objM71118a != coroutine_suspended) {
                        string11 = objM71118a;
                        list3 = arrayList;
                        c32405n3 = c32405n;
                        list4 = mutableList;
                        abstractC29172p6 = abstractC29172p5;
                        c32405n4 = c32405n3;
                        list8 = mutableList;
                        list4.add(string11);
                        if (list8 != null) {
                            c32408q = c32405n4;
                            list7 = list8;
                        } else {
                            list6 = list3;
                            c32405n2 = c32405n;
                            c32405n = c32405n4;
                            abstractC29172p5 = abstractC29172p6;
                        }
                        c32405n.f66068d = list7;
                        c29164n5 = abstractC29172p6.mo69762m().f59168e;
                        if (c29164n5 != null) {
                            if (StringsKt.isBlank(str8)) {
                                str8 = null;
                            }
                            if (str8 != null) {
                                List mutableList12 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                                mutableList12.add(0, new C28715d(str8));
                                c32405n3.f66068d = mutableList12;
                                Unit unit11 = Unit.INSTANCE;
                            }
                        }
                        abstractC32410T = c32408q;
                        if (abstractC32410T instanceof C32408Q) {
                            List list1118 = abstractC32410T.f66068d;
                            arrayList5 = new ArrayList();
                            while (r1.hasNext()) {
                                if (obj5 instanceof C28716e) {
                                    arrayList5.add(obj5);
                                }
                            }
                            c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                            if (c28716e7 != null) {
                                sNSStepState = c28716e7.f58403d;
                            } else {
                                sNSStepState = null;
                            }
                            autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                            if (autoCloseOnApproveTimeout != null) {
                                iIntValue = autoCloseOnApproveTimeout.intValue();
                            } else {
                                iIntValue = 3;
                            }
                            if (sNSStepState == SNSStepState.APPROVED) {
                                AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                            }
                        }
                        AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                c32405n2 = c32405n;
                c32405n3 = c32405n2;
                list6 = arrayList;
                list7 = list6;
                c32408q = c32405n;
                abstractC29172p6 = abstractC29172p5;
                c32405n = c32405n2;
                c32405n.f66068d = list7;
                c29164n5 = abstractC29172p6.mo69762m().f59168e;
                if (c29164n5 != null) {
                    if (StringsKt.isBlank(str8)) {
                        str8 = null;
                    }
                    if (str8 != null) {
                        List mutableList13 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                        mutableList13.add(0, new C28715d(str8));
                        c32405n3.f66068d = mutableList13;
                        Unit unit12 = Unit.INSTANCE;
                    }
                }
                abstractC32410T = c32408q;
                if (abstractC32410T instanceof C32408Q) {
                    List list1119 = abstractC32410T.f66068d;
                    arrayList5 = new ArrayList();
                    while (r1.hasNext()) {
                        if (obj5 instanceof C28716e) {
                            arrayList5.add(obj5);
                        }
                    }
                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                    if (c28716e7 != null) {
                        sNSStepState = c28716e7.f58403d;
                    } else {
                        sNSStepState = null;
                    }
                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                    if (autoCloseOnApproveTimeout != null) {
                        iIntValue = autoCloseOnApproveTimeout.intValue();
                    } else {
                        iIntValue = 3;
                    }
                    if (sNSStepState == SNSStepState.APPROVED) {
                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                    }
                }
                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                return Unit.INSTANCE;
            case 14:
                List list22 = (List) c32398g.f66020g;
                List list23 = c32398g.f66019f;
                c32405n = (C32405N) c32398g.f66018e;
                List list24 = (List) c32398g.f66017d;
                c32405n3 = (C32405N) c32398g.f66016c;
                c32405n4 = (C32405N) c32398g.f66015b;
                abstractC29172p6 = (AbstractC29172p) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                i27 = 1;
                list3 = list22;
                list4 = list23;
                list8 = list24;
                list4.add(string11);
                if (list8 != null) {
                    c32408q = c32405n4;
                    list7 = list8;
                } else {
                    list6 = list3;
                    c32405n2 = c32405n;
                    c32405n = c32405n4;
                    abstractC29172p5 = abstractC29172p6;
                    list7 = list6;
                    c32408q = c32405n;
                    abstractC29172p6 = abstractC29172p5;
                    c32405n = c32405n2;
                }
                c32405n.f66068d = list7;
                c29164n5 = abstractC29172p6.mo69762m().f59168e;
                if (c29164n5 != null) {
                    if (StringsKt.isBlank(str8)) {
                        str8 = null;
                    }
                    if (str8 != null) {
                        List mutableList14 = CollectionsKt.toMutableList((Collection) c32405n3.f66068d);
                        mutableList14.add(0, new C28715d(str8));
                        c32405n3.f66068d = mutableList14;
                        Unit unit13 = Unit.INSTANCE;
                    }
                }
                abstractC32410T = c32408q;
                if (abstractC32410T instanceof C32408Q) {
                    List list11110 = abstractC32410T.f66068d;
                    arrayList5 = new ArrayList();
                    while (r1.hasNext()) {
                        if (obj5 instanceof C28716e) {
                            arrayList5.add(obj5);
                        }
                    }
                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                    if (c28716e7 != null) {
                        sNSStepState = c28716e7.f58403d;
                    } else {
                        sNSStepState = null;
                    }
                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                    if (autoCloseOnApproveTimeout != null) {
                        iIntValue = autoCloseOnApproveTimeout.intValue();
                    } else {
                        iIntValue = 3;
                    }
                    if (sNSStepState == SNSStepState.APPROVED) {
                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                    }
                }
                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                return Unit.INSTANCE;
            case 15:
                List list25 = (List) c32398g.f66015b;
                C28879c c28879c12 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                list = list25;
                c28879c7 = c28879c12;
                i27 = 1;
                charSequence14 = (CharSequence) string11;
                c32398g.f66014a = c28879c7;
                c32398g.f66015b = list;
                c32398g.f66016c = charSequence14;
                c32398g.f66023j = 16;
                string6 = getString("sns_status_APPROVED_subtitle", c32398g);
                if (string6 != coroutine_suspended) {
                    c28879c5 = c28879c7;
                    charSequence15 = charSequence14;
                    string11 = string6;
                    charSequence16 = (CharSequence) string11;
                    c32398g.f66014a = c28879c5;
                    c32398g.f66015b = list;
                    c32398g.f66016c = charSequence15;
                    c32398g.f66017d = charSequence16;
                    c32398g.f66023j = 17;
                    string7 = getString("sns_status_APPROVED_footerHtml", c32398g);
                    if (string7 != coroutine_suspended) {
                        List list26 = list;
                        charSequence17 = charSequence15;
                        list9 = list26;
                        C28879c c28879c13 = c28879c5;
                        charSequence18 = charSequence16;
                        string11 = string7;
                        c28879c2 = c28879c13;
                        c32408q = new C32405N(charSequence17, charSequence18, (CharSequence) string11, CollectionsKt.emptyList(), null, false, SNSApplicantStatusAnalyticsState.Approved, null);
                        list = list9;
                        arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList6.add(AbstractC28878b.m69662a(getStrings(), (Document) it.next(), ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c2));
                        }
                        c32408q.f66068d = arrayList6;
                        abstractC32410T = c32408q;
                        if (abstractC32410T instanceof C32408Q) {
                            List list11111 = abstractC32410T.f66068d;
                            arrayList5 = new ArrayList();
                            while (r1.hasNext()) {
                                if (obj5 instanceof C28716e) {
                                    arrayList5.add(obj5);
                                }
                            }
                            c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                            if (c28716e7 != null) {
                                sNSStepState = c28716e7.f58403d;
                            } else {
                                sNSStepState = null;
                            }
                            autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                            if (autoCloseOnApproveTimeout != null) {
                                iIntValue = autoCloseOnApproveTimeout.intValue();
                            } else {
                                iIntValue = 3;
                            }
                            if (sNSStepState == SNSStepState.APPROVED) {
                                AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                            }
                        }
                        AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 16:
                charSequence15 = (CharSequence) c32398g.f66016c;
                list = (List) c32398g.f66015b;
                c28879c5 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                i27 = 1;
                charSequence16 = (CharSequence) string11;
                c32398g.f66014a = c28879c5;
                c32398g.f66015b = list;
                c32398g.f66016c = charSequence15;
                c32398g.f66017d = charSequence16;
                c32398g.f66023j = 17;
                string7 = getString("sns_status_APPROVED_footerHtml", c32398g);
                if (string7 != coroutine_suspended) {
                    List list27 = list;
                    charSequence17 = charSequence15;
                    list9 = list27;
                    C28879c c28879c14 = c28879c5;
                    charSequence18 = charSequence16;
                    string11 = string7;
                    c28879c2 = c28879c14;
                    c32408q = new C32405N(charSequence17, charSequence18, (CharSequence) string11, CollectionsKt.emptyList(), null, false, SNSApplicantStatusAnalyticsState.Approved, null);
                    list = list9;
                    arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList6.add(AbstractC28878b.m69662a(getStrings(), (Document) it.next(), ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c2));
                    }
                    c32408q.f66068d = arrayList6;
                    abstractC32410T = c32408q;
                    if (abstractC32410T instanceof C32408Q) {
                        List list11112 = abstractC32410T.f66068d;
                        arrayList5 = new ArrayList();
                        while (r1.hasNext()) {
                            if (obj5 instanceof C28716e) {
                                arrayList5.add(obj5);
                            }
                        }
                        c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                        if (c28716e7 != null) {
                            sNSStepState = c28716e7.f58403d;
                        } else {
                            sNSStepState = null;
                        }
                        autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                        if (autoCloseOnApproveTimeout != null) {
                            iIntValue = autoCloseOnApproveTimeout.intValue();
                        } else {
                            iIntValue = 3;
                        }
                        if (sNSStepState == SNSStepState.APPROVED) {
                            AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                        }
                    }
                    AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 17:
                CharSequence charSequence35 = (CharSequence) c32398g.f66017d;
                CharSequence charSequence36 = (CharSequence) c32398g.f66016c;
                List list28 = (List) c32398g.f66015b;
                c28879c2 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                charSequence18 = charSequence35;
                list9 = list28;
                i27 = 1;
                charSequence17 = charSequence36;
                c32408q = new C32405N(charSequence17, charSequence18, (CharSequence) string11, CollectionsKt.emptyList(), null, false, SNSApplicantStatusAnalyticsState.Approved, null);
                list = list9;
                arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList6.add(AbstractC28878b.m69662a(getStrings(), (Document) it.next(), ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c2));
                }
                c32408q.f66068d = arrayList6;
                abstractC32410T = c32408q;
                if (abstractC32410T instanceof C32408Q) {
                    List list11113 = abstractC32410T.f66068d;
                    arrayList5 = new ArrayList();
                    while (r1.hasNext()) {
                        if (obj5 instanceof C28716e) {
                            arrayList5.add(obj5);
                        }
                    }
                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                    if (c28716e7 != null) {
                        sNSStepState = c28716e7.f58403d;
                    } else {
                        sNSStepState = null;
                    }
                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                    if (autoCloseOnApproveTimeout != null) {
                        iIntValue = autoCloseOnApproveTimeout.intValue();
                    } else {
                        iIntValue = 3;
                    }
                    if (sNSStepState == SNSStepState.APPROVED) {
                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                    }
                }
                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                return Unit.INSTANCE;
            case 18:
                List list29 = (List) c32398g.f66015b;
                C28879c c28879c15 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                list = list29;
                c28879c7 = c28879c15;
                i27 = 1;
                charSequence19 = (CharSequence) string11;
                c32398g.f66014a = c28879c7;
                c32398g.f66015b = list;
                c32398g.f66016c = charSequence19;
                c32398g.f66023j = 19;
                string8 = getString("sns_status_REJECT_subtitle", c32398g);
                if (string8 != coroutine_suspended) {
                    c28879c6 = c28879c7;
                    charSequence20 = charSequence19;
                    string11 = string8;
                    charSequence21 = (CharSequence) string11;
                    c32398g.f66014a = c28879c6;
                    c32398g.f66015b = list;
                    c32398g.f66016c = charSequence20;
                    c32398g.f66017d = charSequence21;
                    c32398g.f66023j = 20;
                    string9 = getString("sns_status_REJECT_footerHtml", c32398g);
                    if (string9 != coroutine_suspended) {
                        list10 = list;
                        charSequence22 = charSequence21;
                        string11 = string9;
                        charSequence23 = (CharSequence) string11;
                        listEmptyList2 = CollectionsKt.emptyList();
                        c32398g.f66014a = c28879c6;
                        c32398g.f66015b = list10;
                        c32398g.f66016c = charSequence20;
                        c32398g.f66017d = charSequence22;
                        c32398g.f66018e = charSequence23;
                        c32398g.f66019f = listEmptyList2;
                        c32398g.f66023j = 21;
                        string10 = getString("sns_status_REJECT_action_continue", c32398g);
                        if (string10 != coroutine_suspended) {
                            charSequence24 = charSequence22;
                            charSequence25 = charSequence20;
                            list9 = list10;
                            list11 = listEmptyList2;
                            charSequence26 = charSequence23;
                            string11 = string10;
                            c28879c2 = c28879c6;
                            c32408q = new C32405N(charSequence25, charSequence24, charSequence26, list11, (CharSequence) string11, false, SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                            list = list9;
                            arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                            it = list.iterator();
                            while (it.hasNext()) {
                                arrayList6.add(AbstractC28878b.m69662a(getStrings(), (Document) it.next(), ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c2));
                            }
                            c32408q.f66068d = arrayList6;
                            abstractC32410T = c32408q;
                            if (abstractC32410T instanceof C32408Q) {
                                List list11114 = abstractC32410T.f66068d;
                                arrayList5 = new ArrayList();
                                while (r1.hasNext()) {
                                    if (obj5 instanceof C28716e) {
                                        arrayList5.add(obj5);
                                    }
                                }
                                c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                                if (c28716e7 != null) {
                                    sNSStepState = c28716e7.f58403d;
                                } else {
                                    sNSStepState = null;
                                }
                                autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                                if (autoCloseOnApproveTimeout != null) {
                                    iIntValue = autoCloseOnApproveTimeout.intValue();
                                } else {
                                    iIntValue = 3;
                                }
                                if (sNSStepState == SNSStepState.APPROVED) {
                                    AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                                }
                            }
                            AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                            return Unit.INSTANCE;
                        }
                    }
                }
                return coroutine_suspended;
            case 19:
                charSequence20 = (CharSequence) c32398g.f66016c;
                list = (List) c32398g.f66015b;
                C28879c c28879c16 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                i27 = 1;
                c28879c6 = c28879c16;
                charSequence21 = (CharSequence) string11;
                c32398g.f66014a = c28879c6;
                c32398g.f66015b = list;
                c32398g.f66016c = charSequence20;
                c32398g.f66017d = charSequence21;
                c32398g.f66023j = 20;
                string9 = getString("sns_status_REJECT_footerHtml", c32398g);
                if (string9 != coroutine_suspended) {
                    list10 = list;
                    charSequence22 = charSequence21;
                    string11 = string9;
                    charSequence23 = (CharSequence) string11;
                    listEmptyList2 = CollectionsKt.emptyList();
                    c32398g.f66014a = c28879c6;
                    c32398g.f66015b = list10;
                    c32398g.f66016c = charSequence20;
                    c32398g.f66017d = charSequence22;
                    c32398g.f66018e = charSequence23;
                    c32398g.f66019f = listEmptyList2;
                    c32398g.f66023j = 21;
                    string10 = getString("sns_status_REJECT_action_continue", c32398g);
                    if (string10 != coroutine_suspended) {
                        charSequence24 = charSequence22;
                        charSequence25 = charSequence20;
                        list9 = list10;
                        list11 = listEmptyList2;
                        charSequence26 = charSequence23;
                        string11 = string10;
                        c28879c2 = c28879c6;
                        c32408q = new C32405N(charSequence25, charSequence24, charSequence26, list11, (CharSequence) string11, false, SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                        list = list9;
                        arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                        it = list.iterator();
                        while (it.hasNext()) {
                            arrayList6.add(AbstractC28878b.m69662a(getStrings(), (Document) it.next(), ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c2));
                        }
                        c32408q.f66068d = arrayList6;
                        abstractC32410T = c32408q;
                        if (abstractC32410T instanceof C32408Q) {
                            List list11115 = abstractC32410T.f66068d;
                            arrayList5 = new ArrayList();
                            while (r1.hasNext()) {
                                if (obj5 instanceof C28716e) {
                                    arrayList5.add(obj5);
                                }
                            }
                            c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                            if (c28716e7 != null) {
                                sNSStepState = c28716e7.f58403d;
                            } else {
                                sNSStepState = null;
                            }
                            autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                            if (autoCloseOnApproveTimeout != null) {
                                iIntValue = autoCloseOnApproveTimeout.intValue();
                            } else {
                                iIntValue = 3;
                            }
                            if (sNSStepState == SNSStepState.APPROVED) {
                                AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                            }
                        }
                        AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                        return Unit.INSTANCE;
                    }
                }
                return coroutine_suspended;
            case 20:
                CharSequence charSequence37 = (CharSequence) c32398g.f66017d;
                CharSequence charSequence38 = (CharSequence) c32398g.f66016c;
                list10 = (List) c32398g.f66015b;
                c28879c6 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                charSequence22 = charSequence37;
                charSequence20 = charSequence38;
                i27 = 1;
                charSequence23 = (CharSequence) string11;
                listEmptyList2 = CollectionsKt.emptyList();
                c32398g.f66014a = c28879c6;
                c32398g.f66015b = list10;
                c32398g.f66016c = charSequence20;
                c32398g.f66017d = charSequence22;
                c32398g.f66018e = charSequence23;
                c32398g.f66019f = listEmptyList2;
                c32398g.f66023j = 21;
                string10 = getString("sns_status_REJECT_action_continue", c32398g);
                if (string10 != coroutine_suspended) {
                    charSequence24 = charSequence22;
                    charSequence25 = charSequence20;
                    list9 = list10;
                    list11 = listEmptyList2;
                    charSequence26 = charSequence23;
                    string11 = string10;
                    c28879c2 = c28879c6;
                    c32408q = new C32405N(charSequence25, charSequence24, charSequence26, list11, (CharSequence) string11, false, SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                    list = list9;
                    arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                    it = list.iterator();
                    while (it.hasNext()) {
                        arrayList6.add(AbstractC28878b.m69662a(getStrings(), (Document) it.next(), ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c2));
                    }
                    c32408q.f66068d = arrayList6;
                    abstractC32410T = c32408q;
                    if (abstractC32410T instanceof C32408Q) {
                        List list11116 = abstractC32410T.f66068d;
                        arrayList5 = new ArrayList();
                        while (r1.hasNext()) {
                            if (obj5 instanceof C28716e) {
                                arrayList5.add(obj5);
                            }
                        }
                        c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                        if (c28716e7 != null) {
                            sNSStepState = c28716e7.f58403d;
                        } else {
                            sNSStepState = null;
                        }
                        autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                        if (autoCloseOnApproveTimeout != null) {
                            iIntValue = autoCloseOnApproveTimeout.intValue();
                        } else {
                            iIntValue = 3;
                        }
                        if (sNSStepState == SNSStepState.APPROVED) {
                            AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                        }
                    }
                    AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                    return Unit.INSTANCE;
                }
                return coroutine_suspended;
            case 21:
                List list30 = c32398g.f66019f;
                CharSequence charSequence39 = (CharSequence) c32398g.f66018e;
                CharSequence charSequence40 = (CharSequence) c32398g.f66017d;
                CharSequence charSequence41 = (CharSequence) c32398g.f66016c;
                List list31 = (List) c32398g.f66015b;
                c28879c2 = (C28879c) c32398g.f66014a;
                ResultKt.throwOnFailure(string11);
                list11 = list30;
                list9 = list31;
                charSequence24 = charSequence40;
                charSequence25 = charSequence41;
                i27 = 1;
                charSequence26 = charSequence39;
                c32408q = new C32405N(charSequence25, charSequence24, charSequence26, list11, (CharSequence) string11, false, SNSApplicantStatusAnalyticsState.TemporarilyDeclined, null);
                list = list9;
                arrayList6 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                it = list.iterator();
                while (it.hasNext()) {
                    arrayList6.add(AbstractC28878b.m69662a(getStrings(), (Document) it.next(), ApplicantStatus.Reviewed, (40 & 8) == 0, c28879c2));
                }
                c32408q.f66068d = arrayList6;
                abstractC32410T = c32408q;
                if (abstractC32410T instanceof C32408Q) {
                    List list11117 = abstractC32410T.f66068d;
                    arrayList5 = new ArrayList();
                    while (r1.hasNext()) {
                        if (obj5 instanceof C28716e) {
                            arrayList5.add(obj5);
                        }
                    }
                    c28716e7 = (C28716e) CollectionsKt.firstOrNull((List) arrayList5);
                    if (c28716e7 != null) {
                        sNSStepState = c28716e7.f58403d;
                    } else {
                        sNSStepState = null;
                    }
                    autoCloseOnApproveTimeout = C28468k0.f57983a.getAutoCloseOnApproveTimeout();
                    if (autoCloseOnApproveTimeout != null) {
                        iIntValue = autoCloseOnApproveTimeout.intValue();
                    } else {
                        iIntValue = 3;
                    }
                    if (sNSStepState == SNSStepState.APPROVED) {
                        AbstractC28052C.finish$default(this, new C28500v(), null, Boxing.boxLong(TimeUnit.SECONDS.toMillis(iIntValue)), null, 10, null);
                    }
                }
                AbstractC28073M0.updateState$default(this, false, new C32399H(abstractC32410T, null), i27, null);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m71122b(String str) {
        C41696j.m91104d(ViewModelKt.getViewModelScope(this), null, null, new C28447d1(this, this.f66048g, str, new Function1() { // from class: com.sumsub.sns.internal.features.presentation.status.a0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return C32403L.m71115a(this.f66079b, (String) obj);
            }
        }, null), 3, null);
    }

    /* JADX INFO: renamed from: a */
    public static final C32411U m71111a(C32403L c32403l) {
        C29713w3 c29713w3;
        String strM69770a;
        C29124h config = c32403l.getConfig();
        String strReplace$default = null;
        if (config == null || (c29713w3 = config.f59080m) == null || c29713w3.f59777a != SumsubIdType.INTRUSIVE) {
            return null;
        }
        C29124h config2 = c32403l.getConfig();
        String strM69770a2 = config2 != null ? AbstractC29130i.m69770a("sumsubid.banner.title", config2.f59089v) : null;
        C29124h config3 = c32403l.getConfig();
        if (config3 != null && (strM69770a = AbstractC29130i.m69770a("sumsubid.banner.description", config3.f59089v)) != null) {
            strReplace$default = StringsKt.replace$default(strM69770a, "{learnMoreLink}", "sumsub://sumsubid-learn-more", false, 4, (Object) null);
        }
        C28936t c28936t = c32403l.f66055n;
        KProperty kProperty = f66041o[0];
        return new C32411U(strM69770a2, strReplace$default, ((Boolean) c28936t.m69705a()).booleanValue());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: a */
    public final Object m71118a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        C32455x c32455x;
        SNSStepState sNSStepState;
        List list;
        String str;
        SNSStepState sNSStepState2;
        List list2;
        if (continuationImpl instanceof C32455x) {
            c32455x = (C32455x) continuationImpl;
            int i11 = c32455x.f66166f;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c32455x.f66166f = i11 - Integer.MIN_VALUE;
            } else {
                c32455x = new C32455x(this, continuationImpl);
            }
        } else {
            c32455x = new C32455x(this, continuationImpl);
        }
        Object obj = c32455x.f66164d;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = c32455x.f66166f;
        if (i12 == 0) {
            ResultKt.throwOnFailure(obj);
            SNSStepState sNSStepState3 = SNSStepState.REJECTED;
            c32455x.f66161a = arrayList;
            c32455x.f66162b = sNSStepState3;
            c32455x.f66166f = 1;
            Object string = getString("sns_step_VIDEO_IDENT_title", c32455x);
            if (string != coroutine_suspended) {
                sNSStepState = sNSStepState3;
                obj = string;
                list = arrayList;
            }
            return coroutine_suspended;
        }
        if (i12 == 1) {
            SNSStepState sNSStepState4 = c32455x.f66162b;
            List list3 = c32455x.f66161a;
            ResultKt.throwOnFailure(obj);
            sNSStepState = sNSStepState4;
            list = list3;
        } else {
            if (i12 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            String str2 = c32455x.f66163c;
            SNSStepState sNSStepState5 = c32455x.f66162b;
            List list4 = c32455x.f66161a;
            ResultKt.throwOnFailure(obj);
            str = str2;
            sNSStepState2 = sNSStepState5;
            list2 = list4;
        }
        return new C28713b(sNSStepState2, str, (CharSequence) obj, true, new C28714c(SNSDocumentViewTypeInfo$Type.VIDEO_IDENTIFICATION, (Document) CollectionsKt.first(list2)));
        String str3 = (String) obj;
        if (str3 == null) {
            str3 = "";
        }
        c32455x.f66161a = list;
        c32455x.f66162b = sNSStepState;
        c32455x.f66163c = str3;
        c32455x.f66166f = 2;
        Object string2 = getString("sns_iddoc_status_notSubmitted", c32455x);
        if (string2 != coroutine_suspended) {
            str = str3;
            obj = string2;
            sNSStepState2 = sNSStepState;
            list2 = list;
            return new C28713b(sNSStepState2, str, (CharSequence) obj, true, new C28714c(SNSDocumentViewTypeInfo$Type.VIDEO_IDENTIFICATION, (Document) CollectionsKt.first(list2)));
        }
        return coroutine_suspended;
    }

    /* JADX INFO: renamed from: a */
    public static final Unit m71115a(C32403L c32403l, String str) {
        c32403l.fireEvent(new C32446r(str));
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: a */
    public static ArrayList m71114a(List list, AbstractC29172p abstractC29172p) {
        List list2;
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        Document document = null;
        while (it.hasNext()) {
            Document document2 = (Document) it.next();
            String str = document2.getType().f59014a;
            if (!abstractC29172p.mo69760k().f59152b || ((list2 = abstractC29172p.mo69760k().f59154d) != null && list2.contains(str))) {
                arrayList.add(document2);
            } else if (document == null) {
                document = new Document(new C29070X("VIDEO_IDENT"), document2.getResult());
            } else if (document2.isRejected() || ((document.isReviewing() && !document2.isReviewing()) || (document.isApproved() && !document2.isApproved()))) {
                document = Document.copy$default(document, null, document2.getResult(), 1, null);
            }
        }
        if (document != null) {
            arrayList.add(document);
        }
        return arrayList;
    }
}
