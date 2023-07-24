function displayVideo(videoUrl,vName,vPoster) {
  var iframe = document.createElement('iframe');
  iframe.src = videoUrl;
  iframe.width = '80%';
  iframe.height = '700px';
  iframe.frameBorder = 0;
  iframe.style.border='1px solid #fff';
  iframe.style.margin = '4rem';
  iframe.setAttribute('poster',vPoster)
  document.getElementById('video-container-h1').innerHTML = vName;
  document.getElementById('video-container-h1').classList.add('video-container-h1');
  document.getElementById('video-container').innerHTML='';
  document.getElementById('video-container').appendChild(iframe);
}
