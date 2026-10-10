package com.kubi.quotefacade.helper;

import android.util.Log;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.quotefacade.constant.TimeSelectedEnum;
import com.kubi.quotefacade.entity.ChainFilterData;
import com.kubi.quotefacade.entity.ChainListParam;
import com.kubi.quotefacade.entity.SortSets;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p414kv.C41985a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: renamed from: com.kubi.quotefacade.helper.m, reason: from Kotlin metadata */
/* JADX INFO: compiled from: ChainParamManager.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90083d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00052\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u000e\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u000eJ\u000e\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u0005J\u0018\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0005J\u0006\u0010 \u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018¨\u0006!"}, m90084d2 = {"Lcom/kubi/quotefacade/helper/ChainParamManager;", "", "<init>", "()V", "TAG", "", "PAGE_SIZE", "", "DEFAULT_TAB_CODE", "logi", "", "tag", "msg", "chainFilterData", "Lcom/kubi/quotefacade/entity/ChainFilterData;", "getChainFilterData", "()Lcom/kubi/quotefacade/entity/ChainFilterData;", "setChainFilterData", "(Lcom/kubi/quotefacade/entity/ChainFilterData;)V", "chainListParam", "Lcom/kubi/quotefacade/entity/ChainListParam;", "getChainListParam", "()Lcom/kubi/quotefacade/entity/ChainListParam;", "setChainListParam", "(Lcom/kubi/quotefacade/entity/ChainListParam;)V", "updateChainFilterAndParamData", "filterData", "updateTimeRange", "time", "updateSortType", "sortType", "sortSide", "reset", "QuoteFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ChainParamManager {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final ChainParamManager f42002a = new ChainParamManager();

    /* JADX INFO: renamed from: b */
    @NotNull
    public static ChainFilterData f42003b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static ChainListParam f42004c;

    static {
        ChainFilterData chainFilterData = new ChainFilterData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 524287, null);
        chainFilterData.setOrderByRange(TimeSelectedEnum.TIME_24_HOURS.getConstTimeTag());
        chainFilterData.setChainSortType("");
        f42003b = chainFilterData;
        ChainListParam chainListParamM92062c = C41985a.m92062c(new ChainListParam(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null), f42003b);
        chainListParamM92062c.setMenuCode(TtmlNode.COMBINE_ALL);
        chainListParamM92062c.setPageSize(15);
        chainListParamM92062c.setCurrentPage(1);
        f42004c = chainListParamM92062c;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public final ChainFilterData m51962a() {
        return f42003b;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final ChainListParam m51963b() {
        return f42004c;
    }

    /* JADX INFO: renamed from: c */
    public final void m51964c(String str, String str2) {
        Log.i(str, Thread.currentThread() + " ： " + str2);
    }

    /* JADX INFO: renamed from: d */
    public final void m51965d() {
        ChainFilterData chainFilterData = new ChainFilterData(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 524287, null);
        chainFilterData.setOrderByRange(TimeSelectedEnum.TIME_24_HOURS.getConstTimeTag());
        chainFilterData.setChainSortType("");
        f42003b = chainFilterData;
        ChainListParam chainListParamM92062c = C41985a.m92062c(new ChainListParam(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null), f42003b);
        chainListParamM92062c.setMenuCode(TtmlNode.COMBINE_ALL);
        chainListParamM92062c.setPageSize(15);
        chainListParamM92062c.setCurrentPage(1);
        f42004c = chainListParamM92062c;
    }

    /* JADX INFO: renamed from: e */
    public final void m51966e(@NotNull ChainFilterData filterData) {
        Intrinsics.checkNotNullParameter(filterData, "filterData");
        m51964c("ChainParamManager", "updateChainFilterData=" + filterData.getChainSortType() + " --> " + filterData.getOrderByRange());
        C41985a.m92060a(f42003b, filterData);
        C41985a.m92062c(f42004c, f42003b);
    }

    /* JADX INFO: renamed from: f */
    public final void m51967f(@NotNull String sortType, @Nullable String str) {
        Intrinsics.checkNotNullParameter(sortType, "sortType");
        m51964c("ChainParamManager", "updateSortType=" + sortType + ' ' + str);
        SortSets sortSets = f42004c.getSortSets();
        if (sortSets != null) {
            if (str == null || StringsKt.isBlank(str)) {
                sortSets.setField("");
                sortSets.setSide("");
            } else {
                sortSets.setField(sortType);
                sortSets.setSide(str);
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m51968g(@NotNull String time) {
        Intrinsics.checkNotNullParameter(time, "time");
        m51964c("ChainParamManager", "updatTimeRange=" + time);
        f42003b.setOrderByRange(time);
        f42004c.setOrderByRange(time);
    }
}
