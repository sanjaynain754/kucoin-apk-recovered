package com.google.android.gms.auth.blockstore;

import android.content.Context;
import androidx.annotation.NonNull;
import com.google.android.gms.internal.auth_blockstore.zzaa;

/* JADX INFO: compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class Blockstore {
    @NonNull
    public static BlockstoreClient getClient(@NonNull Context context) {
        return new zzaa(context);
    }

    private Blockstore() {
    }
}
