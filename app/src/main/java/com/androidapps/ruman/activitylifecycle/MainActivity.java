/*
 * Copyright (C) 2015 A B M Ruman
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.androidapps.ruman.activitylifecycle;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onContentChanged() {
        Toast.makeText(MainActivity.this, "onContentChanged", Toast.LENGTH_SHORT).show();
        super.onContentChanged();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(MainActivity.this, "onCreate", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(MainActivity.this, "onRestart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(MainActivity.this, "onStart", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(MainActivity.this, "onResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onResumeFragments() {
        super.onResumeFragments();
        Toast.makeText(MainActivity.this, "onResumeFragments", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        Toast.makeText(MainActivity.this, "onPostResume", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onBackPressed() {
        Toast.makeText(MainActivity.this, "onBackPressed", Toast.LENGTH_SHORT).show();
        super.onBackPressed();
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(MainActivity.this, "onPause", Toast.LENGTH_SHORT).show();
    }

    @Override
    protected void onStop() {
        Toast.makeText(MainActivity.this, "onStop", Toast.LENGTH_SHORT).show();
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Toast.makeText(MainActivity.this, "onDestroy", Toast.LENGTH_SHORT).show();
        super.onDestroy();
    }

}
