window.addEventListener('load', function() {
    setTimeout(function() {
        document.getElementById('preloader').style.display = 'none';
        document.querySelector('.content').classList.remove('hidden');
        var elements = document.querySelectorAll('.fade-in');
        elements.forEach(function(element) {
            element.classList.add('fade-in-active');
        });
    }, 10000); 
});