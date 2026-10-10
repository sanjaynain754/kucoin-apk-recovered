package ai.advance.core;

import android.app.IntentService;
import android.content.Intent;
import androidx.annotation.Nullable;
import p416l.AbstractC42009a;

/* JADX INFO: loaded from: classes23.dex */
public abstract class NLServiceParent extends IntentService {
    /* JADX INFO: renamed from: a */
    public abstract AbstractC42009a m1253a();

    @Override // android.app.IntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // android.app.IntentService
    public void onHandleIntent(@Nullable Intent intent) {
        try {
            m1253a();
            if (intent != null) {
                intent.getStringExtra("eventInfo");
            }
            throw null;
        } catch (Exception unused) {
        }
    }
}
