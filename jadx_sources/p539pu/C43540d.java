package p539pu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.text.TextUtils;
import com.kubi.permissions.R$string;
import com.kubi.permissions.compliance.PermissionComplianceManifest;
import com.kubi.permissions.exception.PermissionException;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p569qq.C43846g;
import p573qu.InterfaceC43874a;
import p694vk.C45590s;
import p852kotlin.Metadata;
import p852kotlin.collections.ArraysKt;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.enums.EnumEntries;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: pu.d */
/* JADX INFO: compiled from: PermissionComplianceManifest.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u00006\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u00012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u0000\u001a\u001d\u0010\u0004\u001a\u00020\u00052\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007H\u0000¢\u0006\u0002\u0010\b\u001a/\u0010\t\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\u0010\f\u001a/\u0010\r\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0000¢\u0006\u0002\u0010\f\u001aF\u0010\u000e\u001a\u0002H\u000f\"\u0006\b\u0000\u0010\u0010\u0018\u0001\"\u0004\b\u0001\u0010\u000f2\u0017\u0010\u0011\u001a\u0013\u0012\u0004\u0012\u0002H\u0010\u0012\u0004\u0012\u0002H\u000f0\u0012¢\u0006\u0002\b\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u000f0\u0015H\u0080\bø\u0001\u0000¢\u0006\u0002\u0010\u0016\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, m90084d2 = {"getDisplaySeparator", "", "context", "Landroid/content/Context;", "assertPermissionManifest", "", "permissions", "", "([Ljava/lang/String;)Z", "getDisplayTitle", "separator", "", "(Landroid/content/Context;[Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;", "getDisplayContent", "flavor", "R", "F", TUIConstants.TIMPush.NOTIFICATION.ACTION, "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "default", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "LPermissions_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nPermissionComplianceManifest.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PermissionComplianceManifest.kt\ncom/kubi/permissions/compliance/PermissionComplianceManifestKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 4 PermissionIssue.kt\ncom/kubi/permissions/exception/PermissionIssueKt\n*L\n1#1,242:1\n238#1,2:243\n238#1,2:259\n238#1,2:264\n238#1,2:275\n1563#2:245\n1634#2,3:246\n1869#2:252\n1870#2:255\n774#2:261\n865#2,2:262\n774#2:266\n865#2,2:267\n1374#2:269\n1460#2,5:270\n774#2:277\n865#2,2:278\n1374#2:280\n1460#2,5:281\n3829#3:249\n4344#3,2:250\n3829#3:256\n4344#3,2:257\n32#4,2:253\n*S KotlinDebug\n*F\n+ 1 PermissionComplianceManifest.kt\ncom/kubi/permissions/compliance/PermissionComplianceManifestKt\n*L\n135#1:243,2\n161#1:259,2\n188#1:264,2\n204#1:275,2\n136#1:245\n136#1:246,3\n138#1:252\n138#1:255\n168#1:261\n168#1:262,2\n195#1:266\n195#1:267,2\n197#1:269\n197#1:270,5\n211#1:277\n211#1:278,2\n213#1:280\n213#1:281,5\n138#1:249\n138#1:250,2\n148#1:256\n148#1:257,2\n142#1:253,2\n*E\n"})
public final class C43540d {
    /* JADX INFO: renamed from: d */
    public static final boolean m95810d(@Nullable String[] strArr) {
        List<String> listM96648d;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC43874a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (listM96648d = ((InterfaceC43874a) objM56186h).m96648d()) == null) {
            EnumEntries<PermissionComplianceManifest> entries = PermissionComplianceManifest.getEntries();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
            Iterator<PermissionComplianceManifest> it = entries.iterator();
            while (it.hasNext()) {
                arrayList.add(it.next().getSystemKey());
            }
            listM96648d = arrayList;
        }
        ArrayList arrayList2 = null;
        if (strArr != null) {
            ArrayList<String> arrayList3 = new ArrayList();
            for (String str : strArr) {
                if (!listM96648d.contains(str)) {
                    arrayList3.add(str);
                }
            }
            for (String str2 : arrayList3) {
                if (C45590s.f102687a.m100666Q()) {
                    throw new RuntimeException("manifest is not exist:" + str2);
                }
                C43846g.m96568c(new PermissionException(new RuntimeException("manifest is not exist:" + str2), "PermissionComplianceManifest", false, null, 8, null), null, 2, null);
            }
        }
        if (strArr != null) {
            arrayList2 = new ArrayList();
            for (String str3 : strArr) {
                if (listM96648d.contains(str3)) {
                    arrayList2.add(str3);
                }
            }
        }
        return true ^ (arrayList2 == null || arrayList2.isEmpty());
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final String m95811e(@NotNull final Context context, @Nullable String[] strArr, @NotNull CharSequence separator) {
        String strJoinToString$default;
        String strJoinToString$default2;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(separator, "separator");
        Object objM56186h = Router.f46192a.m56186h(InterfaceC43874a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (strJoinToString$default = ((InterfaceC43874a) objM56186h).m96645a(context, strArr, separator)) == null) {
            EnumEntries<PermissionComplianceManifest> entries = PermissionComplianceManifest.getEntries();
            ArrayList arrayList = new ArrayList();
            for (PermissionComplianceManifest permissionComplianceManifest : entries) {
                PermissionComplianceManifest permissionComplianceManifest2 = permissionComplianceManifest;
                if (strArr != null && ArraysKt.contains(strArr, permissionComplianceManifest2.getSystemKey())) {
                    arrayList.add(permissionComplianceManifest);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                CollectionsKt.addAll(arrayList2, ((PermissionComplianceManifest) it.next()).getCollectData());
            }
            strJoinToString$default = CollectionsKt.joinToString$default(CollectionsKt.distinct(arrayList2), separator, null, null, 0, null, new Function1() { // from class: pu.a
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C43540d.m95812f(context, ((Integer) obj).intValue());
                }
            }, 30, null);
        }
        String str = strJoinToString$default;
        Object objM56186h2 = Router.f46192a.m56186h(InterfaceC43874a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h2 == null || (strJoinToString$default2 = ((InterfaceC43874a) objM56186h2).m96647c(context, strArr, separator)) == null) {
            EnumEntries<PermissionComplianceManifest> entries2 = PermissionComplianceManifest.getEntries();
            ArrayList arrayList3 = new ArrayList();
            for (PermissionComplianceManifest permissionComplianceManifest3 : entries2) {
                PermissionComplianceManifest permissionComplianceManifest4 = permissionComplianceManifest3;
                if (strArr != null && ArraysKt.contains(strArr, permissionComplianceManifest4.getSystemKey())) {
                    arrayList3.add(permissionComplianceManifest3);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                CollectionsKt.addAll(arrayList4, ((PermissionComplianceManifest) it2.next()).getSupportFeature());
            }
            strJoinToString$default2 = CollectionsKt.joinToString$default(CollectionsKt.distinct(arrayList4), separator, null, null, 0, null, new Function1() { // from class: pu.b
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C43540d.m95813g(context, ((Integer) obj).intValue());
                }
            }, 30, null);
        }
        if (TextUtils.isEmpty(str)) {
            String string = context.getString(R$string.permission_compliance_content_by_support_feature, strJoinToString$default2);
            Intrinsics.checkNotNull(string);
            return string;
        }
        String string2 = context.getString(R$string.permission_compliance_content_by_collect_data_support_feature, str, strJoinToString$default2);
        Intrinsics.checkNotNull(string2);
        return string2;
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final String m95814h(@Nullable Context context) {
        Resources resources;
        Configuration configuration;
        Locale locale;
        return CollectionsKt.arrayListOf(Locale.CHINA.getLanguage(), Locale.JAPAN.getLanguage()).contains(String.valueOf((context == null || (resources = context.getResources()) == null || (configuration = resources.getConfiguration()) == null || (locale = configuration.locale) == null) ? null : locale.getLanguage())) ? "、" : ", ";
    }

    @NotNull
    /* JADX INFO: renamed from: i */
    public static final String m95815i(@NotNull final Context context, @Nullable String[] strArr, @NotNull CharSequence separator) {
        String strJoinToString$default;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(separator, "separator");
        int i11 = R$string.permission_compliance_title;
        Object objM56186h = Router.f46192a.m56186h(InterfaceC43874a.class, SiteInfoManager.f47913a.m58109c());
        if (objM56186h == null || (strJoinToString$default = ((InterfaceC43874a) objM56186h).m96646b(context, strArr, separator)) == null) {
            EnumEntries<PermissionComplianceManifest> entries = PermissionComplianceManifest.getEntries();
            ArrayList arrayList = new ArrayList();
            for (PermissionComplianceManifest permissionComplianceManifest : entries) {
                PermissionComplianceManifest permissionComplianceManifest2 = permissionComplianceManifest;
                if (strArr != null && ArraysKt.contains(strArr, permissionComplianceManifest2.getSystemKey())) {
                    arrayList.add(permissionComplianceManifest);
                }
            }
            strJoinToString$default = CollectionsKt.joinToString$default(arrayList, separator, null, null, 0, null, new Function1() { // from class: pu.c
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return C43540d.m95816j(context, (PermissionComplianceManifest) obj);
                }
            }, 30, null);
        }
        String string = context.getString(i11, strJoinToString$default);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: j */
    public static final CharSequence m95816j(Context context, PermissionComplianceManifest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String string = context.getString(it.getDisplayName());
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: f */
    public static final CharSequence m95812f(Context context, int i11) {
        String string = context.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    /* JADX INFO: renamed from: g */
    public static final CharSequence m95813g(Context context, int i11) {
        String string = context.getString(i11);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }
}
