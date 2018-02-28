<!doctype html>
<html class="no-js">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Amaze后台管理系统模板HTML表单页面 - cssmoban</title>
    <meta name="description" content="这是一个form页面">
    <meta name="keywords" content="form">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <meta name="renderer" content="webkit">
    <meta http-equiv="Cache-Control" content="no-siteapp"/>
    <meta name="apple-mobile-web-app-title" content="Amaze UI"/>
</head>
<body>
	<#include "/common/header.ftl">
<div class="am-cf admin-main">
		<#include "/common/sidebar.ftl">
    <div class="admin-content">

        <div class="am-cf am-padding">
            <div class="am-fl am-cf"><strong class="am-text-primary am-text-lg">表单</strong> /
                <small>form</small>
            </div>
        </div>

        <div class="am-tabs am-margin" data-am-tabs>
            <ul class="am-tabs-nav am-nav am-nav-tabs">
                <li class="am-active"><a href="#tab1">教师基本信息</a></li>
            </ul>

            <div class="am-tabs-bd">
                <div class="am-tab-panel am-fade am-in am-active" id="tab1">
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">姓名</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${teacher.name}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">联系方式</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${teacher.phone}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">职位</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${teacher.job}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">住址</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${teacher.address}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">薪资</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${teacher.salary}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">性别</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${teacher.sex}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">年龄</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${teacher.age}
                            </div>
                        </div>
                    </div>
                    <div class="am-g am-margin-top">
                        <div class="am-u-sm-2 am-text-right">评分</div>
                        <div class="am-u-sm-10">
                            <div class="am-u-sm-4">
                                ${teacher.score}
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!-- content end -->

</div>
<#include "/common/script.ftl">
<#include "/common/link.ftl">
<script src="/assets/student/teacher.js"></script>
</body>
</html>