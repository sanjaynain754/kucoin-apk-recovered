package com.kubi.advert;

import com.kubi.advert.flavor.IOneLinkFlavor;
import com.kubi.router.core.Router;
import com.kubi.sdk.site.info.SiteInfoManager;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.advert.y, reason: from Kotlin metadata */
/* JADX INFO: compiled from: OnelinkUtil.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m90083d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007R\u0014\u0010\b\u001a\u00020\u0007X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\fX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, m90084d2 = {"Lcom/kubi/advert/OnelinkUtil;", "", "<init>", "()V", "matchOneLink", "", "intentData", "", "CUSTOM_DOMAIN", "getCUSTOM_DOMAIN$AdvertLib_googleRelease", "()Ljava/lang/String;", "ONELINK_HOST", "", "getONELINK_HOST$AdvertLib_googleRelease", "()Ljava/util/List;", "AdvertLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOnelinkUtil.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OnelinkUtil.kt\ncom/kubi/advert/OnelinkUtil\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,52:1\n1761#2,3:53\n17#3,2:56\n17#3,2:58\n*S KotlinDebug\n*F\n+ 1 OnelinkUtil.kt\ncom/kubi/advert/OnelinkUtil\n*L\n18#1:53,3\n36#1:56,2\n44#1:58,2\n*E\n"})
public final class OnelinkUtil {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final OnelinkUtil f15184a = new OnelinkUtil();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final String f15185b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final List<String> f15186c;

    /* JADX INFO: renamed from: c */
    public final boolean m14838c(@Nullable String str) {
        if (str == null) {
            return false;
        }
        List<String> list = f15186c;
        if (list == null || !list.isEmpty()) {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (StringsKt.startsWith$default(str, (String) it.next(), false, 2, (Object) null)) {
                    return true;
                }
            }
        }
        return StringsKt.contains$default((CharSequence) str, (CharSequence) "af_deeplink", false, 2, (Object) null);
    }

    static {
        String strM14778a;
        List<String> listListOf;
        Router router = Router.f46192a;
        SiteInfoManager siteInfoManager = SiteInfoManager.f47913a;
        Object objM56186h = router.m56186h(IOneLinkFlavor.class, siteInfoManager.m58109c());
        if (objM56186h == null || (strM14778a = ((IOneLinkFlavor) objM56186h).m14778a()) == null) {
            strM14778a = "link.kucoin.com";
        }
        f15185b = strM14778a;
        Object objM56186h2 = router.m56186h(IOneLinkFlavor.class, siteInfoManager.m58109c());
        if (objM56186h2 == null || (listListOf = ((IOneLinkFlavor) objM56186h2).m14779b()) == null) {
            listListOf = CollectionsKt.listOf((Object[]) new String[]{"https://kucoin.onelink.me", "https://" + strM14778a, "https://kucoin-test.onelink.me"});
        }
        f15186c = listListOf;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m14836a() {
        return f15185b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final List<String> m14837b() {
        return f15186c;
    }
}
