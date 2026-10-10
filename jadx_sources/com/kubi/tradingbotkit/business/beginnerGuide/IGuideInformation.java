package com.kubi.tradingbotkit.business.beginnerGuide;

import android.view.View;
import com.kubi.tradingbotkit.entity.gudiGuide.PictureEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;

/* JADX INFO: renamed from: com.kubi.tradingbotkit.business.beginnerGuide.o, reason: from Kotlin metadata */
/* JADX INFO: compiled from: IGuideInformation.kt */
/* JADX INFO: loaded from: classes51.dex */
@Metadata(m90083d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J$\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH&J\u0010\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\b\u0010\r\u001a\u00020\u0003H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000eÀ\u0006\u0001"}, m90084d2 = {"Lcom/kubi/tradingbotkit/business/beginnerGuide/IGuideInformation;", "", "getPageTitle", "", "showPagePicture", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "mutableMap", "", "", "Lcom/kubi/tradingbotkit/entity/gudiGuide/PictureEntity;", "showPageInformation", "getLayoutId", "TradingBotKitLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public interface IGuideInformation {
    /* JADX INFO: renamed from: a */
    int mo63847a();

    /* JADX INFO: renamed from: b */
    void mo63848b(@NotNull View view, @NotNull Map<String, PictureEntity> map);

    /* JADX INFO: renamed from: c */
    int mo63849c();

    /* JADX INFO: renamed from: d */
    void mo63850d(@NotNull View view);
}
