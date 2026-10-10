package com.google.api.client.googleapis.batch;

import com.google.api.client.http.HttpHeaders;
import java.io.IOException;

/* JADX INFO: loaded from: classes56.dex */
public interface BatchCallback<T, E> {
    void onFailure(E e11, HttpHeaders httpHeaders) throws IOException;

    void onSuccess(T t11, HttpHeaders httpHeaders) throws IOException;
}
