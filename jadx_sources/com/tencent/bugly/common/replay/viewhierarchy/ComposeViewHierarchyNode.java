package com.tencent.bugly.common.replay.viewhierarchy;

import android.annotation.TargetApi;
import android.view.View;
import com.tencent.bugly.common.replay.BuglyReplayOptions;
import com.tencent.qcloud.tuicore.TUIConstants;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
@Metadata(m90083d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÁ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n¨\u0006\u000b"}, m90084d2 = {"Lcom/tencent/bugly/common/replay/viewhierarchy/ComposeViewHierarchyNode;", "", "()V", "fromView", "", TUIConstants.TIMAppKit.Extension.ProfileSettings.KEY_VIEW, "Landroid/view/View;", "parent", "Lcom/tencent/bugly/common/replay/viewhierarchy/ViewHierarchyNode;", "options", "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;", "bugly-pro_release"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
@TargetApi(26)
public final class ComposeViewHierarchyNode {

    @NotNull
    public static final ComposeViewHierarchyNode INSTANCE = new ComposeViewHierarchyNode();

    private ComposeViewHierarchyNode() {
    }

    public final boolean fromView(@NotNull View view, @Nullable ViewHierarchyNode parent, @NotNull BuglyReplayOptions options) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(options, "options");
        String name = view.getClass().getName();
        Intrinsics.checkNotNullExpressionValue(name, "view::class.java.name");
        if (!StringsKt.contains$default((CharSequence) name, (CharSequence) "AndroidComposeView", false, 2, (Object) null)) {
            return false;
        }
        return true;
    }
}
