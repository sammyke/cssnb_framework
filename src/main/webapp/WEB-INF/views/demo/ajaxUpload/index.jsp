<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Fine Uploader</title>
<meta charset="utf-8" />
<script type="text/javascript" src="${ctx}/resources/jquery/jquery-1.8.1.min.js"></script>
<link rel="stylesheet" href="${ctx}/resources/bootstrap/css/bootstrap.min.css" type="text/css">
<link href="${ctx}/resources/global/js/ajaxUpload/fineuploader.css" rel="stylesheet" type="text/css" />
<script src="${ctx}/resources/global/js/ajaxUpload/util.js"></script>
<script src="${ctx}/resources/global/js/ajaxUpload/button.js"></script>
<script src="${ctx}/resources/global/js/ajaxUpload/handler.base.js"></script>
<script src="${ctx}/resources/global/js/ajaxUpload/handler.form.js"></script>
<script src="${ctx}/resources/global/js/ajaxUpload/handler.xhr.js"></script>
<script src="${ctx}/resources/global/js/ajaxUpload/uploader.basic.js"></script>
<script src="${ctx}/resources/global/js/ajaxUpload/dnd.js"></script>
<script src="${ctx}/resources/global/js/ajaxUpload/uploader.js"></script>
<script>
var endpoint = "${ctx}/ajaxUpload";
</script>
<script src="${ctx}/resources/global/js/ajaxUpload/uploader-demo.js"></script>
</head>
<body>
	<h1>Fine Uploader Demo（可直接降文件拖到页面上传）</h1>
	<div id="examples">
		<div class="example">
			<h3>单选上传 & 自动提交</h3>
			<p>This is the Fine Uploader with only required options set. Note that, by default, you may also drag & drop files onto the button if you are using a browser that supports the multiple attribute on input elements, and the File and FormData objects, as well as the upload function on the XHR
				object. This currently rules out at least IE 9 and earlier.</p>
			<ul id="basicUploadSuccessExample" class="unstyled"></ul>
		</div>
		<div class="example">
			<h3>手动触发上传</h3>
			<p>
				The default behavior of Fine Uploader is to immediately attempt to upload files as they are selected. One option allows you to simply queue all files, and then start uploading at a later time by calling
				<code>uploadStoredFiles()</code>
				on your Fine Uploader instance.
			</p>
			<ul id="manualUploadModeExample" class="unstyled"></ul>
			<span id="triggerUpload" class="btn btn-primary">Upload Queued Files</span>
		</div>
		<div class="example">
			<h3>返回上传失败的消息</h3>
			<p>
				If your server returns a response that includes a reason property, such as
				<code>{"success": false, "reason": "unsupported file type"}</code>
				the error message is accessible in the UI by hovering over the failed upload item.
			</p>
			<ul id="basicUploadFailureExample" class="unstyled"></ul>
		</div>
		<div class="example">
			<h3>可设置上传限制的后缀</h3>
			<p>
				There are various options available to you when using Fine Uploader. In this example, I've used a small subset of these options to create an uploader with custom upload button text, restricted to one file upload/selection at once (may not select multiple files), restricted to
				<code>jpeg</code>
				,
				<code>jpg</code>
				, and
				<code>txt</code>
				files, and restricted to a max file size of 50 kb.
			</p>
			<ul id="uploadWithVariousOptionsExample" class="unstyled"></ul>
		</div>
		<div class="example">
			<h3>FineUploads基本控件</h3>
			<div id="fubUploadButton" class="btn btn-primary">
				<div>Select Files</div>
			</div>
		</div>
		<h4 class="endingRemark">
			Fine Uploader is currently an active project, and many improvements and adjustments are possible in the near future. Please see the <a href="https://github.com/valums/file-uploader">Github project page</a> for more details. You may also examine the <a href="js/uploader-demo.js" class="decorate"><code>uploader-demo.js</code>
			</a> source file on this page.
		</h4>
	</div>
</body>
</html>