package com.kubi.notice.lib.api;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.bumptech.glide.ComponentCallbacks2C5309c;
import com.kubi.sdk.BaseApplication;
import com.tencent.qcloud.tuicore.TUIConstants;
import com.tencent.rmonitor.base.p144db.table.ReportDataTable;
import gs.C38009a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p058cj.C4988a;
import p445m2.AbstractC42400k;
import p481ny.C42899b;
import p569qq.C43852m;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: com.kubi.notice.lib.api.c */
/* JADX INFO: compiled from: NoticeEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\u001a,\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a,\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u001a\u001e\u0010\t\u001a\u00020\u0001*\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\f\u001a\u00020\r¨\u0006\u000e"}, m90084d2 = {"noticeExpose", "", "pageId", "", "blockId", "locationId", ReportDataTable.COLUMN_PARAMS, "Lorg/json/JSONObject;", "noticeClick", "loadIcon", "Landroid/widget/ImageView;", "url", "defaultIcon", "", "NoticeLib_googleRelease"}, m90085k = 2, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nNoticeEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NoticeEx.kt\ncom/kubi/notice/lib/api/NoticeExKt\n+ 2 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n+ 3 NoticeIssue.kt\ncom/kubi/notice/lib/exception/NoticeIssueKt\n*L\n1#1,95:1\n167#2,4:96\n45#3,4:100\n*S KotlinDebug\n*F\n+ 1 NoticeEx.kt\ncom/kubi/notice/lib/api/NoticeExKt\n*L\n80#1:96,4\n92#1:100,4\n*E\n"})
public final class C19412c {
    /* JADX INFO: renamed from: a */
    public static final void m43162a(@NotNull ImageView imageView, @Nullable String str, int i11) {
        AbstractC42400k<ImageView, Drawable> abstractC42400kM6594E0;
        Intrinsics.checkNotNullParameter(imageView, "<this>");
        if (str != null) {
            try {
                if (str.length() != 0) {
                    if (i11 == -1) {
                        abstractC42400kM6594E0 = ComponentCallbacks2C5309c.m6556t(BaseApplication.INSTANCE.get()).mo6634v(str).m6594E0(imageView);
                    } else {
                        BaseApplication.Companion companion = BaseApplication.INSTANCE;
                        abstractC42400kM6594E0 = ComponentCallbacks2C5309c.m6556t(companion.get()).mo6634v(str).mo92190c0(companion.get().getDrawable(i11)).m6594E0(imageView);
                    }
                    Intrinsics.checkNotNull(abstractC42400kM6594E0);
                    return;
                }
            } catch (Exception e11) {
                if (C42899b.m94075e(e11)) {
                    return;
                }
                C38009a.m85882c(e11, TUIConstants.TUIChat.NOTICE, "loadIcon");
                return;
            }
        }
        if (i11 != -1) {
            ComponentCallbacks2C5309c.m6556t(BaseApplication.INSTANCE.get()).mo6632t(Integer.valueOf(i11)).m6594E0(imageView);
        }
    }

    /* JADX INFO: renamed from: b */
    public static final void m43163b(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C4988a.m5286a("【通知模块点击埋点】-> pageId:" + pageId + " blockId:" + blockId + " locationId:" + locationId + " params:" + jSONObject, "notice_track");
        C43852m.m96589a(pageId, blockId, locationId, jSONObject);
    }

    /* JADX INFO: renamed from: c */
    public static final void m43164c(@NotNull String pageId, @NotNull String blockId, @NotNull String locationId, @Nullable JSONObject jSONObject) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(blockId, "blockId");
        Intrinsics.checkNotNullParameter(locationId, "locationId");
        C4988a.m5286a("【通知模块曝光埋点】-> pageId:" + pageId + " blockId:" + blockId + " locationId:" + locationId + " params:" + jSONObject, "notice_track");
        C43852m.m96593e(pageId, blockId, locationId, jSONObject);
    }
}
