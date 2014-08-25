<?php ?>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
<title>JS Tips</title>
<script src="http://code.jquery.com/jquery-2.1.1.min.js"
	type="text/javascript"></script>
<!-- <script src="http://sample.atmarkit.jp/fux/1210/04/three.min.js"
	type="text/javascript"></script>
<script src="other.js" type="text/javascript"></script>
 -->
<script>
	// キャメル文字列→定数文字列
	function toUpper() {
		var str = $('#convert-before').val();
		var strs = str.split('');
		var result = strs[0];
		for (var i = 1; i < strs.length; i++) {
			if (strs[i].match("[A-Z]") != null) {
				result += "_" + strs[i];
			} else {
				result += strs[i];
			}
		}
		$('#convert-after').val(result.toUpperCase());
	}

	// 定数文字列→キャメル文字列
	function toLower() {
		var str = $('#convert-after').val();
		var strs = str.split('_');
		var result = "";
		var strz = null;
		for (var i = 0; i < strs.length; i++) {
			if (i > 0) {
				var strz = strs[i].split('');
				result += strz[0];
				for (var j = 1; j < strz.length; j++) {
					result += strz[j].toLowerCase();
				}
			} else {
				result += strs[i].toLowerCase();
			}
		}
		$('#convert-before').val(result);
	}

	// 秒→分、時間、日にち変換
	function toTime(value) {
		var second = $('#second').val();
		switch (value) {
		case 1:
			time = second / 60;
			break;
		case 2:
			time = second / 60 / 60;
			break;
		case 3:
			time = second / 60 / 60 / 24;
			break;
		}
		$('#console-time').text("result : " + time);
	}

	function showCount(str) {
		$('#word-count-result').text("result : " + str.length + "文字");
	}

	function nikkei() {
		$('#opening')

	}
</script>
</head>
<body>
	<hr>
	<h3>キャメル文字列→定数文字列 { cf.)sampleSampleSource→SAMPLE_SAMPLE_SOURCE }</h3>
	<textarea id="convert-before" style="width: 602px; height: 60px;"></textarea>
	<input type="button" value="変換" onclick="toUpper()" />
	<br>
	<br>

	<h3>定数文字列→キャメル文字列 { cf.)SAMPLE_SAMPLE_SOURCE→sampleSampleSource }</h3>
	<textarea id="convert-after" style="width: 602px; height: 60px;"></textarea>
	<input type="button" value="変換" onclick="toLower()" />

	<hr>
	<h3>秒→分、時間、日</h3>
	<input type="text" id="second" value="" />
	<input type="button" value="分" onclick="toTime(1)" />
	<input type="button" value="時間" onclick="toTime(2)" />
	<input type="button" value="日" onclick="toTime(3)" />
	<br>
	<div id="console-time"></div>

	<hr>
	<h3>文字数カウンタ</h3>
	<textarea id="word-count" rows="3" cols="100" onkeyup="showCount(value)"></textarea>
	<br>
	<div id="word-count-result"></div>

	<hr>
	<h3>仮、日経平均</h3>
	<input type="text" id="opening" value=""/>
	<input type="text" id="high" value=""/>
	<input type="text" id="low" value=""/>
	<input type="text" id="closing" value=""/>
	<input type="button" value="go" onclick="nikkei()"/>
	<br>
	gugd
	<div id="gugd"></div>
	youseninsen
	<div id="pn"></div>
	hige
	<div id="hige"></div>
</body>
</html>
