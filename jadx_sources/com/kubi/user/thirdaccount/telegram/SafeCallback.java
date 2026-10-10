package com.kubi.user.thirdaccount.telegram;

import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import org.jetbrains.annotations.NotNull;
import p569qq.C43840a;
import p852kotlin.Metadata;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: TelegramAuthActivity.kt */
/* JADX INFO: loaded from: classes53.dex */
@Metadata(m90083d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016J)\u0010\u000b\u001a\u00020\u00062\u000e\u0010\f\u001a\n \r*\u0004\u0018\u00010\b0\b2\u000e\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\u000f0\u000fH\u0096\u0001J\u0019\u0010\u0010\u001a\u00020\u00112\u000e\u0010\f\u001a\n \r*\u0004\u0018\u00010\b0\bH\u0096\u0001J)\u0010\u0012\u001a\u00020\u00062\u000e\u0010\f\u001a\n \r*\u0004\u0018\u00010\b0\b2\u000e\u0010\u000e\u001a\n \r*\u0004\u0018\u00010\n0\nH\u0096\u0001R\u000e\u0010\u0002\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m90084d2 = {"Lcom/kubi/user/thirdaccount/telegram/SafeCallback;", "Landroid/view/ActionMode$Callback;", "delegate", "<init>", "(Landroid/view/ActionMode$Callback;)V", "onCreateActionMode", "", "mode", "Landroid/view/ActionMode;", "menu", "Landroid/view/Menu;", "onActionItemClicked", "p0", "kotlin.jvm.PlatformType", "p1", "Landroid/view/MenuItem;", "onDestroyActionMode", "", "onPrepareActionMode", "Companion", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
public final class SafeCallback implements ActionMode.Callback {

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final Companion f53822b = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final ActionMode.Callback f53823a;

    /* JADX INFO: compiled from: TelegramAuthActivity.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/user/thirdaccount/telegram/SafeCallback$Companion;", "", "<init>", "()V", "TAG", "", "UserCenterLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    public SafeCallback(@NotNull ActionMode.Callback delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f53823a = delegate;
    }

    @Override // android.view.ActionMode.Callback
    public boolean onActionItemClicked(ActionMode p11, MenuItem p12) {
        return this.f53823a.onActionItemClicked(p11, p12);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onCreateActionMode(@NotNull ActionMode mode, @NotNull Menu menu) {
        Intrinsics.checkNotNullParameter(mode, "mode");
        Intrinsics.checkNotNullParameter(menu, "menu");
        try {
            return this.f53823a.onCreateActionMode(mode, menu);
        } catch (Exception unused) {
            C43840a.m96548b("telegram auth create action mode resource not found", "SafeCallback");
            return false;
        }
    }

    @Override // android.view.ActionMode.Callback
    public void onDestroyActionMode(ActionMode p11) {
        this.f53823a.onDestroyActionMode(p11);
    }

    @Override // android.view.ActionMode.Callback
    public boolean onPrepareActionMode(ActionMode p11, Menu p12) {
        return this.f53823a.onPrepareActionMode(p11, p12);
    }
}
