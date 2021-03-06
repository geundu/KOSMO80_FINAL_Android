package com.example.paprika;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;

public class CourseFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_course, container, false);
        WebView mWebView = view.findViewById(R.id.courseWebView);
        // Enable Javascript
        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);
        // 화면 비율
        webSettings.setUseWideViewPort(true);// wide viewport를 사용하도록 설정
        webSettings.setLoadWithOverviewMode(true);// 컨텐츠가 웹뷰보다 클 경우 스크린 크기에 맞게 조정
        // 웹뷰 멀티 터치 가능하게 (줌기능)
        //webSettings.setBuiltInZoomControls(true);// 줌 아이콘 사용
        webSettings.setSupportZoom(true);
        // Force links and redirects to open in the WebView instead of in a browser
        mWebView.setWebViewClient(new WebViewClient());
        mWebView.loadUrl("http://rmsen.iptime.org:4578/E_LearningPage.jsp");
        return view;
    }

}