package com.juarez.mvpdemoseries.presenter;

import android.content.Context;
import android.util.Log;

import com.juarez.mvpdemoseries.interfaces.ILogin;
import com.juarez.mvpdemoseries.model.LoginInteractor;

public class LoginPresenter implements ILogin.IPresenter {
    private ILogin.IView view;
    private ILogin.IModel interactor;
    private static final String TAG = "LoginPresenter";

    public LoginPresenter(ILogin.IView view) {
        this.view = view;
        interactor = new LoginInteractor(this);
    }

    @Override
    public void getToken() {
        Log.e(TAG, "presenter ->");
        interactor.getToken();
    }

    @Override
    public void setContext(Context context) {
        interactor.setContext(context);
    }

    @Override
    public void showErrorApi(String error) {
        view.showErrorApi(error);

    }

    @Override
    public void showTokenUser(String token) {
        Log.e(TAG, "<- presenter");
        view.showTokenUser(token);
    }
}
