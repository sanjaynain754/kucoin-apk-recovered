package com.kubi.kweb.p093ui;

import androidx.lifecycle.LifecycleOwnerKt;
import kotlinx.coroutines.C41696j;
import org.jetbrains.annotations.NotNull;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: KWebSsgActivity.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\u0007"}, m90084d2 = {"Lcom/kubi/kweb/ui/KWebSsgActivity;", "Lcom/kubi/kweb/ui/KWebActivity;", "<init>", "()V", "startLoad", "", "Companion", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class KWebSsgActivity extends KWebActivity {

    /* JADX INFO: renamed from: u */
    @NotNull
    public static final Companion f31032u = new Companion(null);

    /* JADX INFO: compiled from: KWebSsgActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/kweb/ui/KWebSsgActivity$Companion;", "", "<init>", "()V", "TAG", "", "KWebLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    @Override // com.kubi.widget.web.ui.KWebBaseActivity
    /* JADX INFO: renamed from: O0 */
    public void mo14848O0() {
        C41696j.m91104d(LifecycleOwnerKt.getLifecycleScope(this), null, null, new KWebSsgActivity$startLoad$1(this, null), 3, null);
    }
}
