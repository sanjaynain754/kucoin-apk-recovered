package com.kubi.kumex.guide;

import com.kubi.resources.dialog.DialogFragmentHelper;
import com.kubi.utils.DataMapUtil;
import com.tencent.qcloud.tim.push.model.TIMPushProvider;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: DialogFragmentGuide.kt */
/* JADX INFO: loaded from: classes20.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH\u0004J\b\u0010\r\u001a\u00020\nH\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016R\u0012\u0010\u0005\u001a\u00020\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0012"}, m90084d2 = {"Lcom/kubi/kumex/guide/DialogFragmentGuide;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "Lcom/kubi/kumex/guide/StepGuide;", "<init>", "()V", "manager", "Landroidx/fragment/app/FragmentManager;", "getManager", "()Landroidx/fragment/app/FragmentManager;", "endGuide", "", "key", "", TIMPushProvider.f75063o, "forceNotifyTranslationY", "allowOtherStepGuideFloatToDisplayOnUpper", "", "other", "KumexLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public abstract class DialogFragmentGuide extends DialogFragmentHelper implements StepGuide {
    @Override // com.kubi.kumex.guide.StepGuide
    /* JADX INFO: renamed from: H2 */
    public boolean mo25562H2(@NotNull StepGuide other) {
        Intrinsics.checkNotNullParameter(other, "other");
        return false;
    }

    /* JADX INFO: renamed from: j4 */
    public final void m33769j4(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        DataMapUtil dataMapUtil = DataMapUtil.f54245a;
        String strM66375i = dataMapUtil.m66375i("kumex_open_guide_2", "");
        if (strM66375i.length() != 0) {
            key = strM66375i + ',' + key;
        }
        dataMapUtil.m66380o("kumex_open_guide_2", key);
    }

    @Override // com.kubi.kumex.guide.StepGuide
    public void hide() {
    }
}
