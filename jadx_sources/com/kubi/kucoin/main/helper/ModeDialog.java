package com.kubi.kucoin.main.helper;

import android.os.Bundle;
import androidx.annotation.LayoutRes;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.kubi.resources.dialog.DialogFragmentHelper;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: ModeDialog.kt */
/* JADX INFO: loaded from: classes18.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/main/helper/ModeDialog;", "Lcom/kubi/resources/dialog/DialogFragmentHelper;", "<init>", "()V", "isBottomWindowAnimation", "", "playExitAnimationThenDismiss", "Companion", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class ModeDialog extends DialogFragmentHelper {

    /* JADX INFO: renamed from: q0 */
    @NotNull
    public static final Companion f27995q0 = new Companion(null);

    /* JADX INFO: compiled from: ModeDialog.kt */
    @Metadata(m90083d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, m90084d2 = {"Lcom/kubi/kucoin/main/helper/ModeDialog$Companion;", "", "<init>", "()V", "newInstance", "Lcom/kubi/kucoin/main/helper/ModeDialog;", "layoutId", "", "KuFacadeLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }

        @NotNull
        public final ModeDialog newInstance(@LayoutRes int layoutId) {
            ModeDialog modeDialog = new ModeDialog();
            Bundle bundle = new Bundle();
            bundle.putInt(TtmlNode.TAG_LAYOUT, layoutId);
            bundle.putInt("type", 0);
            bundle.putInt("anim", 0);
            bundle.putBoolean("isBottomSheet", true);
            bundle.putBoolean("isAnimationEnabled", false);
            bundle.putBoolean("isDraggable", true);
            modeDialog.setArguments(bundle);
            return modeDialog;
        }
    }

    @Override // com.kubi.resources.dialog.DialogFragmentHelper
    /* JADX INFO: renamed from: X3 */
    public boolean mo32431X3() {
        return false;
    }

    @Override // com.kubi.resources.dialog.BaseDialogFragment
    /* JADX INFO: renamed from: l3 */
    public boolean mo32432l3() {
        return false;
    }
}
