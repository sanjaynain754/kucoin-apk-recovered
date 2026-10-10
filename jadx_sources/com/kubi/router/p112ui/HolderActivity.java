package com.kubi.router.p112ui;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import cy.C36554a;
import cy.C36556c;
import cy.InterfaceC36555b;
import dh0.C36686b;
import java.util.concurrent.ConcurrentLinkedQueue;
import org.aspectj.lang.InterfaceC43175a;
import p813yy.C46611a;

/* JADX INFO: loaded from: classes39.dex */
public class HolderActivity extends FragmentActivity {

    /* JADX INFO: renamed from: i */
    public static volatile ConcurrentLinkedQueue<C36556c> f46208i;

    /* JADX INFO: renamed from: j */
    public static /* synthetic */ InterfaceC43175a.a f46209j;

    /* JADX INFO: renamed from: d */
    public C36556c f46210d;

    /* JADX INFO: renamed from: G */
    public static void m56208G(C36556c c36556c) {
        f46208i.offer(c36556c);
    }

    private static /* synthetic */ void ajc$preClinit() {
        C36686b c36686b = new C36686b("HolderActivity.java", HolderActivity.class);
        f46209j = c36686b.m82128h("method-execution", c36686b.m82127g("4", "attachBaseContext", "com.kubi.router.ui.HolderActivity", "android.content.Context", "newBase", "", "void"), 38);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) throws Throwable {
        C46611a.m102764b().m102767e(new C36554a(new Object[]{this, context, C36686b.m82123c(f46209j, this, this, context)}).linkClosureAndJoinPoint(69648));
    }

    static {
        ajc$preClinit();
        f46208i = new ConcurrentLinkedQueue<>();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i11, int i12, Intent intent) {
        InterfaceC36555b interfaceC36555bM81827d;
        super.onActivityResult(i11, i12, intent);
        C36556c c36556c = this.f46210d;
        if (c36556c != null && (interfaceC36555bM81827d = c36556c.m81827d()) != null) {
            interfaceC36555bM81827d.mo4404a(i12, intent);
        }
        finish();
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            return;
        }
        C36556c c36556cPoll = f46208i.poll();
        this.f46210d = c36556cPoll;
        if (c36556cPoll == null) {
            finish();
        } else {
            startActivityForResult(c36556cPoll.m81825b(), this.f46210d.m81826c());
        }
    }
}
