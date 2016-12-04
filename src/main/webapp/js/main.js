jQuery(document).ready(function($){
	//create the slider
	$('.cd-slider-wrapper').flexslider({
		selector: ".cd-slider > li",
		animation: "slide",
		controlNav: false,
		slideshow: true,
		smoothHeight: true,
		start: function(){
			$('.cd-slider').children('li').css({
				'opacity': 1,
				'position': 'relative'
			});
		}
	});
});